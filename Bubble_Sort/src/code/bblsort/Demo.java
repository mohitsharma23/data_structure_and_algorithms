package code.bblsort;

public class Demo {
	public static void main(String args[]) {
		int[] arr = new int[] {12,3,-5,0,8};
		int n = arr.length;
		for(int i = 0 ; i < n-1 ; i++) {
			for(int j = 0 ; j < n-i-1 ; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
