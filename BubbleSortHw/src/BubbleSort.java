
public class BubbleSort {
	
	static int cont = 0;
	public static int[] bubbleSort(int array[]){
		int size = array.length;
		int temp;
		int flag = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i -1; j++) {
				if (array[j] > array[j + 1]) {
					flag = 1;
					if (flag == 1) {
						cont++;
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
		}
		return array;
	}
	
	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i<n; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}

}
