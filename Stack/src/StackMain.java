import java.util.Scanner;

public class StackMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		int ch, check;
		
		do {
			System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit");
			ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.print("Enter the element: ");
					check = stack.push(sc.nextInt());
					if(check == 0) {
						System.out.println("Element added");
					}else {
						System.out.println("Stack is full");
					}
					break;
				case 2:
					check = stack.pop();
					if(check == -1) {
						System.out.println("Stack is empty");
					}else {
						System.out.println("Item: "+check);
					}
					break;
				case 3:
					check = stack.peek();
					if(check == -1) {
						System.out.println("Stack is empty");
					}else {
						System.out.println("Top element is: "+check);
					}
					break;
//				case 4:
//					stack.display();
			}
		}while(ch != 5);
	}
}
