package dsa.search;

import java.util.Arrays;

public class selectionsort{
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int arr[])
	{
	    int j=0;
        int  n=arr.length;
	    while(j<n){
	        int max=0;
	        for(int i=0;i<n-j;i++){
	            if(arr[i]>arr[max]){
	                max=i;
	            }
	        }
	        swap(arr, max, n-1-j);
	        j++;
	        
	        
	    }
	    
	    
	}

    /*static void selection(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            // Find the index of the minimum element in the remaining unsorted array
            int minIndex = i;
            for (int j = i + 1; j < l; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            swap(arr, i, minIndex);
        }
    }*/

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
