package MyLinkedList;

public class LinkedList {
	private Node head; // ���� ù ��° ���
	private Node tail; // ���� ���� ���
	private int size = 0;

	private class Node {
		private Object data; // data field
		private Node next; // next (���� ���) ���� ����̱� ������ ����� �������� ��� ���� �־���Ѵ�.

		public Node(Object input) { // input: LinkedList�� �����͵��� ���� ������ �־�ߵǴµ� �� input �� �ش� ����� �����͸� �ǹ�
			this.data = input;
			this.next = null;
		}

		public String toString() { // debug �Ǵ� �׽�Ʈ Ȯ�ο�
			return String.valueOf(this.data);
		}
	}

	// ù ��° index�� �����͸� ����
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if (head.next == null) { // ��尡 �ϳ��ۿ� ��� head �� tail�� ����Ű�� ���� ����.
			tail = head;
		}
	}

	// ������ index�� �����͸� ����
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if (size == 0) { // �����Ͱ� ���� ���
			addFirst(input); // addFirst�� �̿��Ͽ� �����͸� ����
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	// index�� �ش��ϴ� Node�� �����ϴ� �޼���
	Node node(int index) {
		Node x = head;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

	// Ư�� ��ġ�� Node �� �߰�
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
	
	// ����� ��� ���Ҹ� �������� ���
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
	
	// ù ��° ��Ҹ� ����
	public Object removeFirst() {
		Node temp = head;
		head = head.next;
		Object returnData = temp.data;
		temp = null;		// temp �� �ִ� �����͸� ����
		size--;
		return returnData;
	}
	
	// Ư�� ��ġ�� ��Ҹ� ����
	public Object remove(int k) {
		if(k==0) {		// ù ��° ��带 �����Ѵٸ�
			return removeFirst();		// removeFirst�� ���
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
	
	// ������ ��ġ�� ��带 ����
	public Object removeLast() {
		return remove(size-1);
	}
	
	// ��ũ�帮��Ʈ�� ũ�⸦ ��ȯ
	public int size() {
		return size;
	}
	
	// Ư�� ����� ���� ����
	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
	
	// Ư�� ���� ����Ʈ�� �ִٸ� ��ġ�� ��ȯ
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;
		while(temp.data != data) {
			temp = temp.next;
			index++;
			if(temp == null) {	// ���� ���� ��忡 �����ϸ�
				return -1;
			}
		}
		return index;
	}
	
	// Iterator �� ����
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
		public Object next() {	// ���� ����Ű�� �ִ� ��带 �����ϰ� ���� ��带 ����Ű�Ե�
			lastReturned = next;
			next = next.next;
			nextIndex++;
			
			return lastReturned.data;
		}
		
		// ���� ��尡 �ִ���?�� ��ȯ
		public boolean hasNext() {
			return nextIndex < size();
		}
		
		
		// Iterator�� �̿��ؼ� ����
		public void add(Object input) {
			Node newNode = new Node(input);
			
			// ù ��° ��ġ�� �߰�
			if(lastReturned == null) {
				head = newNode;
				newNode.next = next;
			}else {
				// �߰��� ��ġ�� �߰�
				lastReturned.next = newNode;
				newNode.next = next;				
			}
			lastReturned = newNode;
			nextIndex++;
			size++;
		}
		
		public void remove() {
			if(nextIndex == 0) {	// ���� �ƹ��� ��ҵ� �������� ���� ����
				throw new IllegalStateException();
			}
			
			LinkedList.this.remove(nextIndex-1);
			nextIndex--;			
		}
		
	}
}
