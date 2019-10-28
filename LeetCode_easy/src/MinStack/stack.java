package MinStack;

import java.util.ArrayList;
import java.util.List;

class MinStack {

	private int top;
	private List<Integer> stack;
	private int size = 0;

	/** initialize your data structure here. */
	public MinStack() {
		top = -1;
		stack = new ArrayList<Integer>();
	}

	public void push(int x) {
		stack.add(x);
		top++;
		size++;
	}

	public void pop() {
		stack.remove(top);
		top--;
		size--;
	}

	public int top() {
		return stack.get(top);
	}

	public int getMin() {
		int min = stack.get(0);
		for (int i = 1; i < size; i++) {
			if(min > stack.get(i)) {
				min = stack.get(i);
			}
		}
		return min;
	}
}

public class stack {
	public static void main(String[] args) {
		MinStack ms = new MinStack();
		ms.push(-2);
		ms.push(0);
		ms.push(-3);
		System.out.println(ms.getMin());
		ms.pop();
		System.out.println(ms.top());
		System.out.println(ms.getMin());
	}
}
