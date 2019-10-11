
public class Demo {

	public static void main(String[] args) {
		int[] arr = new int[] {12,3,-5,0,8};
		int n = arr.length, min;
		for(int i = 0 ; i < n-1 ; i++) {
			min = i;
			for(int j = i+1 ; j < n ; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
