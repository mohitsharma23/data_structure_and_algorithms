import java.util.Scanner;

public class Demo {

	public static int binarySearch(int[] arr, int key) {
		int n = arr.length;
		int low = 0, high = n-1, mid;
		
		while(high>=low) {
			mid = (low+high)/2;
			if(arr[mid] == key) {
				return mid;
			}else if(arr[mid] > key) {
				high = mid-1;
			}else {
				low=mid+1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] {2, 5, 10, 54, 78, 125, 455, 823};
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nEnter element to search: ");
		int key = sc.nextInt();
		int res = binarySearch(arr, key);
		if(res == 0) {
			System.out.println("Not Found");
		}else {
			System.out.println("Found at "+ res);
		}
	}

}
