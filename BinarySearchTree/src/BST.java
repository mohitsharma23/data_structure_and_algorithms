import java.util.Scanner;

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int d){
		data = d;
		left = null;
		right = null;
	}
}

public class BST {
	
	public static class BSTDriver{
		Node root;
		
		//Search a Node
		public String search(int data) {
			Node node = searchNode(root, data);
			if(node == null) {
				return "Element not found";
			}
			
			return "Element found";
		}
		
		public Node searchNode(Node root, int data) {
			if(root == null || root.data == data) {
				return root;
			}
			
			if(root.data > data) {
				return searchNode(root.left, data);
			}
			return searchNode(root.right, data);
		}
		
		//Insert a Node
		public void insert(int data) {
			root = insertNode(root, data);
		}
		
		public Node insertNode(Node root, int data) {
			if(root == null) {
				root = new Node(data);
				return root;
			}
			
			if(root.data < data) {
				root.right = insertNode(root.right, data);
			}else if(root.data >= data) {
				root.left = insertNode(root.left, data);
			}
			
			return root;
		}
		
		//Delete a Node
		public void delete(int data) {
			deleteNode(root, data);
		}
		
		public Node deleteNode(Node root, int data) {
			if(root == null)
				return root;
			
			if(data > root.data) {
				root.right = deleteNode(root.right, data);
			}else if(data < root.data) {
				root.left = deleteNode(root.left, data);
			}else {
				if(root.left == null) {
					return root.right;
				}else if(root.right == null) {
					return root.left;
				}
				
				root.data = minValue(root.right);
				
				root.right = deleteNode(root.right, root.data);
			}
			return root;
		}
		
		public int minValue(Node node) {
			int min = node.data;
			while(node.left != null) {
				min = node.left.data;
				node = node.left;
			}
			return min;
		}
		
		//In-order Traversal (left - root - right)
		public void inorder() {
			inorderTraverse(root);
		}
		
		public void inorderTraverse(Node root) {
			if(root != null) {
				inorderTraverse(root.left);
				System.out.println(root.data);
				inorderTraverse(root.right);
			}
		}
		
		//Height of Binary Tree
		public int calcHeight() {
			return findHeight(root);
		}
		
		public int findHeight(Node root) {
			if(root == null){
	            return 0;
	        }
	        
	        int ld = findHeight(root.left);
	        int rd = findHeight(root.right);
	        
	        return Math.max(ld, rd) + 1;
		}
		
		//Level Order Traversal (BFS)
		public void LevelOrder() {
			int h = findHeight(root);
			for(int i = 1 ; i <= h ; i++) {
				BFS(root, i);
			}
		}
		
		public void BFS(Node root, int i) {
			if(root == null) {
				return;
			}
			if(i == 1) {
				 System.out.println(root.data);
			}else if(i > 1) {
				BFS(root.left, i - 1);
				BFS(root.right, i - 1);
			}
		}
	}
	
	public static void main(String[] args) {
		int choice, d = 0;
		
		Scanner sc = new Scanner(System.in);
		BSTDriver bst = new BSTDriver();
		
		do {
			System.out.println("1. Search");
			System.out.println("2. Insert");
			System.out.println("3. Delete");
			System.out.println("4. Inorder");
			System.out.println("5. BFS");
			System.out.println("6. Print Height");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter node to be searched: ");
				d = sc.nextInt();
				System.out.println(bst.search(d));
				break;
			case 2:
				System.out.print("Enter node to be inserted: ");
				d = sc.nextInt();
				bst.insert(d);
				break;
			case 3:
				System.out.print("Enter node to be deleted: ");
				d = sc.nextInt();
				bst.delete(d);
				break;
			case 4: 
				bst.inorder();
				break;
			case 5: 
				bst.LevelOrder();
				break;
			case 6:
				System.out.println("Height: " + bst.calcHeight());
				break;
			}
		}while(choice != 7);
		
	}
}
