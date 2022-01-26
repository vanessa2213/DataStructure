
public class Main {
// In terms of who is faster Bubble Sort it takes less time than the other threes, but in terms of
// memory, the best case is Insertion Sort, however I think in another different array it can change
//the result and even though here the best is bubble sort, not is always the best case.
	
//Also I think that the worst case is Quick Sort and that between merge and insertion sort
// insetion sort should be better because it has less memory.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bs = new BubbleSort();
		MergeSort  ms = new MergeSort();
		InsertionSort is = new InsertionSort();
		QuickSort qs = new QuickSort();
		
		
		int arr[] = {9,26,8,7,100,2,6,10,1,3,20,4};
		int n = arr.length; 
		 
		bs.bubbleSort(arr);   	 	//CPU Time: 0.12 sec(s)
		bs.printArray(arr);    		//Memory: 29696 kilobyte(s)
		
		ms.merge_s(arr, 0, n-1); 	//CPU Time: 0.15 sec(s)
		ms.printArray(arr);    	 	// Memory: 29380 kilobyte(s)
		
		is.insort(arr);         	//CPU Time: 0.15 sec(s)
		is.printArray(arr);			//Memory: 28852 kilobyte(s)
		
	
		qs.sort(arr, 0, n-1);      //CPU Time: 0.18 sec(s)
		qs.printArray(arr);        //Memory: 30036 kilobyte(s)
		
		
	}
	
}
