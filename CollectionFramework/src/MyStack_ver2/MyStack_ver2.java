package MyStack_ver2;

import java.util.ArrayList;
import java.util.List;

class MyStack{
	private int top;
	private List<Integer> stack;
	private int size = 0;
	
	public MyStack() {
		top = -1;
		stack = new ArrayList<Integer>();
	}
	
	public void push(int n) {
		stack.add(n);
		top++;
		size++;
	}
	public int pop() {
		int result = stack.get(top);
		stack.remove(top);
		top--;
		size--;

		return result;
	}
	public int peek() {
		return stack.get(top);
	}
	
	public int Size() {
		return stack.size();
	}
}

public class MyStack_ver2 {
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		
		ms.push(1);
		ms.push(2);
		ms.push(3);
		ms.push(4);
		ms.push(5);
		
		ms.pop();
		ms.pop();
		ms.pop();
				
		ms.peek();
		ms.peek();
		System.out.println(ms.Size());
		
		
	}
}
