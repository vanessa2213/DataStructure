public class MergeSort { 
	public void merge_s(int A[], int p, int r) {
		if (p == r) {
			return;
		} 
		else {
			int q = ((p + r) /2);
			merge_s(A, p, q);
			merge_s(A, q + 1, r);
			Merge(A,p,q,r);
		}
	}
	
	
	public void Merge(int A[], int p, int q, int r) {
		int n1 = q-p+2;
		int n2 = r-q+1;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = p; i <= q; i++) {
			L[i - p] = A[i];
		}
		L[q - p + 1] = Integer.MAX_VALUE;
		for (int j = q + 1; j <= r; j++) {
			R[j - q - 1] = A[j];
		}
		R[r - q] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for (int k = p; k <= r; k++) {
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i++;
			} else {
				A[k] = R[j];
				j++;
			}
		}
		
	}
	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i<n; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
	}