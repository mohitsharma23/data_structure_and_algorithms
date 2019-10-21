
public class Stack {
	private int top;
	private int[] stack;
	
	public Stack() {
		stack = new int[33];
		top = -1;
	}
	
	public boolean checkEmpty() {
		if(top == -1) {
			return true; 
		}
		return false;
	}
	
	public int push(int e) {
		if(top != stack.length-1) {
			stack[++top] = e;
			return 0;
		}
		return -1;
	}
	
	public int pop() {
		if(!checkEmpty()) {
			int temp = stack[top--];
			return temp;
		}
		return -1;
	}
	
	public int peek() {
		if(!checkEmpty()) {
			return stack[top];
		}
		return -1;
	}
	
//	public void display() {
//		for(int i = 0 ; i < stack.length ; i++) {
//			System.out.print(stack[i]+" ");
//		}
//		System.out.println("\n");
//	}
}
