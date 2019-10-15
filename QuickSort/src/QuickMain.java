
public class QuickMain {
	
	public static int Partition(int arr[], int low, int high) {
		int pElement = arr[high];
		int i = low;
		for(int j = low ; j < high ; j++) {
			if(arr[j] <= pElement) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		return i;
		
	}

	public static void QuickSort(int a[], int low, int high) {
		if(low < high) {
			int pivot = Partition(a, low, high);
			
			QuickSort(a, low, pivot - 1);
			QuickSort(a, pivot + 1, high);
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[] {5,3,4,1,2};
		int n = arr.length;
		QuickSort(arr, 0, n-1);
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
