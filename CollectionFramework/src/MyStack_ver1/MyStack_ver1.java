package MyStack_ver1;

class MyStack {

	int top;
	int[] stack;
	int size;

	public MyStack(int size) {
		top = -1;
		stack = new int[size];
		this.size = size;
	}

	public void push(int n) {
		System.out.println(n + " Push");
		stack[++top] = n;
	}

	public int pop() {
		
		int result = stack[top--];
		System.out.println(result + " pop");
		
		return result;
	}

	public int peek() {
		System.out.println("ÇöÀç Top : " + stack[top]);
		return stack[top];
	}

	public void printStack() {
		for (int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}

public class MyStack_ver1 {
	public static void main(String[] args) {
		MyStack mystack = new MyStack(10);

		mystack.push(1);
		mystack.push(2);
		mystack.push(3);
		mystack.push(4);
		mystack.push(5);
		mystack.push(6);
		mystack.push(7);
		mystack.push(8);

		mystack.pop();
		mystack.pop();
		mystack.pop();
		mystack.pop();
		mystack.pop();

		mystack.peek();
		mystack.peek();
		
		System.out.println("-----------------------");
		mystack.printStack();
		System.out.println("-----------------------");
		

	}
}
