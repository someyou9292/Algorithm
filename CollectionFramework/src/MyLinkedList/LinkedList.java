package MyLinkedList;

public class LinkedList {
	private Node head; // 제일 첫 번째 노드
	private Node tail; // 제일 끝의 노드
	private int size = 0;

	private class Node {
		private Object data; // data field
		private Node next; // next (다음 노드) 또한 노드이기 때문에 노드의 성질들을 모두 갖고 있어야한다.

		public Node(Object input) { // input: LinkedList의 데이터들은 값을 가지고 있어야되는데 이 input 이 해당 노드의 데이터를 의미
			this.data = input;
			this.next = null;
		}

		public String toString() { // debug 또는 테스트 확인용
			return String.valueOf(this.data);
		}
	}

	// 첫 번째 index에 데이터를 삽입
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if (head.next == null) { // 노드가 하나밖에 없어서 head 와 tail이 가리키는 것이 같다.
			tail = head;
		}
	}

	// 마지막 index에 데이터를 삽입
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if (size == 0) { // 데이터가 없는 경우
			addFirst(input); // addFirst를 이용하여 데이터를 삽입
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	// index에 해당하는 Node에 접근하는 메서드
	Node node(int index) {
		Node x = head;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

	// 특정 위치에 Node 를 추가
	public void add(int k, Object input) {
		if (k == 0) {
			addFirst(input); 
		} else {
			Node temp1 = node(k-1);
			Node temp2 = temp1.next;
			Node newNode = new Node(input);
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
			if(newNode.next == null) {
				tail = newNode;
			}
		}
	}
	
	// 노드의 모든 원소를 보기위한 출력
	public String toString() {
		if(head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";
		
		while(temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		str += temp.data;
		return str + "]";
	}
	
	// 첫 번째 요소를 삭제
	public Object removeFirst() {
		Node temp = head;
		head = head.next;
		Object returnData = temp.data;
		temp = null;		// temp 에 있는 데이터를 지움
		size--;
		return returnData;
	}
	
	// 특정 위치의 요소를 삭제
	public Object remove(int k) {
		if(k==0) {		// 첫 번째 노드를 삭제한다면
			return removeFirst();		// removeFirst를 사용
		}
		Node temp = node(k-1);
		Node todoDeleted = temp.next;
		temp.next = temp.next.next;
		Object returnData = todoDeleted;
		if(todoDeleted == tail) {
			tail = temp;
		}
		todoDeleted = null;
		size--;
		return returnData;
	}
	
	// 마지막 위치의 노드를 삭제
	public Object removeLast() {
		return remove(size-1);
	}
	
	// 링크드리스트의 크기를 반환
	public int size() {
		return size;
	}
	
	// 특정 요소의 값을 추출
	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
	
	// 특정 값이 리스트에 있다면 위치를 반환
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;
		while(temp.data != data) {
			temp = temp.next;
			index++;
			if(temp == null) {	// 가장 끝의 노드에 도달하면
				return -1;
			}
		}
		return index;
	}
	
	// Iterator 를 구현
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	class ListIterator{
		
		private Node next;
		private Node lastReturned;
		private int nextIndex;
		
		ListIterator(){
			next = head;
		}
		public Object next() {	// 현재 가리키고 있던 노드를 리턴하고 다음 노드를 가리키게됨
			lastReturned = next;
			next = next.next;
			nextIndex++;
			
			return lastReturned.data;
		}
		
		// 다음 노드가 있는지?를 반환
		public boolean hasNext() {
			return nextIndex < size();
		}
		
		
		// Iterator를 이용해서 삽입
		public void add(Object input) {
			Node newNode = new Node(input);
			
			// 첫 번째 위치에 추가
			if(lastReturned == null) {
				head = newNode;
				newNode.next = next;
			}else {
				// 중간의 위치에 추가
				lastReturned.next = newNode;
				newNode.next = next;				
			}
			lastReturned = newNode;
			nextIndex++;
			size++;
		}
		
		public void remove() {
			if(nextIndex == 0) {	// 현재 아무런 요소도 선택하지 않은 상태
				throw new IllegalStateException();
			}
			
			LinkedList.this.remove(nextIndex-1);
			nextIndex--;			
		}
		
	}
}
