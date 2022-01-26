
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bs = new BubbleSort();
		MergeSort ms = new MergeSort();
		
		int arr[] = {9,5,8,7,4,0,6};
		bs.bubbleSort(arr);
		bs.printArray(arr);
	}

}
