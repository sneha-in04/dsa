package dsa.search;

import java.util.Arrays;

public class selectionsort{
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
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
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
