
public class MergeSort {
	
	public static void Merge(int arr[], int start, int mid, int end) {
		int[] temp = new int[end - start + 1];
		int i = start, j = mid+1, k = 0;
		
		while(i<=mid && j<=end) {
			if(arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			}else {
				temp[k++] = arr[j++];
			}
		}
		
		while(i <= mid) {
			temp[k++] = arr[i++];
		}
		
		while(j <= end) {
			temp[k++] = arr[j++];
		}
		
		for(i = start ; i <= end ; i++) {
			arr[i] = temp[i-start];
		}
	}

	public static void MergeSort(int a[], int start, int end) {
		if(start < end) {
			int mid = (start+end)/2;
			MergeSort(a, start, mid);
			MergeSort(a, mid+1, end);
			Merge(a, start, mid, end);
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[] {5,3,4,2,1,6};
		int n = arr.length;
		MergeSort(arr, 0, n-1);
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
