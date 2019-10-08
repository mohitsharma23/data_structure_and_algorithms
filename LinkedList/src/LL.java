import java.util.Scanner;

class Node{
	int data;
	Node next;
	
	Node(int d){
		data = d;
	}
}


public class LL {
	
	public static class LLDriver{
		Node head;
		
		int getLength() {
			int c = 0;
			Node curr = head;
			while(curr != null) {
				c++;
				curr = curr.next; 
			}
			
			return c;
		}
		
		void InsertFront(int d) {
			Node node = new Node(d);
			if(head == null) {
				head = node;
			}else {
				node.next = head;
				head = node;
			}
		}
		
		void InsertEnd(int d) {
			Node node = new Node(d);
			if(head == null) {
				head = node;
			}else {
				Node curr = head;
				while(curr.next != null) {
					curr = curr.next;
				}
				curr.next = node;
			}
			
		}
		
		void InsertPosition(int d, int p) {
			Node node = new Node(d);
			Node curr = head;
			while(p-2 != 0) {
				curr = curr.next;
				p--;
			}
			node.next = curr.next;
			curr.next = node;
		}
		
		void DeleteFront() {
			Node curr = head;
			if(curr != null) {
				head = curr.next;
			}
		}
		
		void DeleteEnd() {
			Node curr = head;
			while(curr.next.next != null) {
				curr = curr.next;
			}
			
			curr.next = null;
		}
		
		void DeletePosition(int p) {
			Node curr = head, prev = null;
			if(p == 1) {
				head = curr.next;
			}else {
				while(p-1 != 0) {
					prev = curr;
					curr = curr.next;
					p--;
				}
				prev.next = curr.next;
				curr.next = null;
			}
			
		}
		
		void Reverse() {
			Node curr = head, prev = null, next = null;
			while(curr != null) {
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}
			head = prev;
		}
		
		void display() {
			Node curr = head;
			while(curr != null) {
				System.out.print(curr.data+"->");
				curr = curr.next;
			}
			System.out.print("NULL\n\n");
		}
	}

	public static void main(String[] args) {
		int choice, data, pos;
		Scanner sc = new Scanner(System.in);
		LLDriver ll = new LLDriver();
		do {
			System.out.println("1. Insert at front");
			System.out.println("2. Insert at end");
			System.out.println("3. Insert at position");
			System.out.println("4. Delete at front");
			System.out.println("5. Delete at end");
			System.out.println("6. Delete at position");
			System.out.println("7. Reverse");
			System.out.println("8. Display");
			System.out.println("9. Get Length");
			System.out.println("10. Exit");
			System.out.println("Enter choice:");
			choice = sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.print("Enter the data: ");
				data = sc.nextInt();
				ll.InsertFront(data);
				break;
			case 2:
				System.out.print("Enter the data: ");
				data = sc.nextInt();
				ll.InsertEnd(data);
				break;
			case 3:
				System.out.print("Enter the data and position: ");
				data = sc.nextInt();
				pos = sc.nextInt();
				ll.InsertPosition(data, pos);
				break;
			case 4:
				ll.DeleteFront();
				break;
			case 5:
				ll.DeleteEnd();
				break;
			case 6:
				System.out.print("Enter the position to delete: ");
				pos = sc.nextInt();
				ll.DeletePosition(pos);
				break;
			case 7:
				ll.Reverse();
				break;
			case 8:
				ll.display();
				break;
			case 9:
				int len = ll.getLength();
				System.out.println("Length of Linked List is: "+len);
				break;
			}
			
		}while(choice != 10);

	}
}
