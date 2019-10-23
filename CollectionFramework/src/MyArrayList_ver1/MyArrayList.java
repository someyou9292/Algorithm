package MyArrayList_ver1;

/*
--------- ArrayList -----------
1) list()
-> 빈 리스트를 생성

2) add(int n)
-> 리스트의 끝에 n을 추가함

3) add(int pos, int n)
-> 리스트의 pos index에 n 을 추가함

4) contains(int n)
-> 리스트에 n이 있는지 판단, 있다면 true, 없으면 false

5) size()
-> 리스트의 크기를 반환

6) isEmpty()
-> 리스트가 비어있으면 true

7) get(int pos)
-> 리스트의 pos 의 위치의 값을 반환

8) remove(int pos)
-> 리스트의 pos 의 위치의 값을 지움

 * */
class myList {
	private int[] list;
	private int default_size = 10;
	private int size = 0;

	public myList() {
		list = new int[default_size];
	}

	public void add(int n) {
		if (size < default_size) {
			list[size] = n;
			size++;
		} else {
			default_size += 10;
			int[] newList = new int[default_size];
			for (int i = 0; i < list.length; i++) {
				newList[i] = list[i];
			}
			list = newList;
			list[size] = n;
			size++;
		}
	}

	public void add(int pos, int n) {
		if (pos < 0 || pos > size) {
			System.out.println("잘못된 값을 입력했습니다.");
		}
		if(size == default_size) {
			default_size += 10;
			int[] newList = new int[default_size];
			for (int i = 0; i < list.length; i++) {
				newList[i] = list[i];
			}
			list = newList;
		}
		for (int i = size; i > pos; i--) {
			list[i] = list[i-1];
		}
		list[pos] = n;
		size++;
	}

	public boolean contains(int n) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == n) {
				return true;
			}
		}
		return false;
	}

	public int size() {

		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public int get(int pos) {

		if (pos < 0 || pos > size) {
			System.out.println("잘못된 값입니다. -1 을 리턴합니다.");
			return -1;
		}
		return list[pos];
	}

	public int remove(int pos) {
		int removeNum = list[pos];
		if (pos < 0 || pos > size) {
			System.out.println("잘못된 값을 입력했습니다. -1을 리턴합니다.");
			return -1;
		}
		for (int i = pos; i < size; i++) {
			if (i < size) {
				list[i] = list[i + 1];
			} else {
				list[size] = 0;
			}
		}
		size--;
		return removeNum;
	}
}

public class MyArrayList {
	public static void main(String[] args) {
		myList list = new myList();

		System.out.println(list.isEmpty());
		System.out.println(list.size());
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list.size());
		System.out.println(list.contains(20));
		System.out.println(list.contains(40));
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.get(1));
		System.out.println(list.isEmpty());
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		list.add(110);
		list.add(120);
		list.add(0, 0);
		list.add(0, 1);
		list.add(0, 1);
		list.add(0, 2);
		list.add(0, 2);
		list.add(0, 3);
		list.add(0, 4);
		list.add(0, 5);
		list.add(0, 5);
		list.remove(0);
		list.remove(0);

		System.out.println("--------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
		System.out.println(list.contains(5));
	}
}
