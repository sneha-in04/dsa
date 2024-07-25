package dsa.search;

import java.util.Arrays;

public class quick {
    public static void main(String[] args) {
        int[] arr = {3, 2, 9, 4, 1};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int part = pivot(arr, low, high);
            quicksort(arr, low, part - 1);
            quicksort(arr, part + 1, high);
        }
    }

    static int pivot(int[] arr, int low, int high) {
        int pivotValue = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            // Move i to the right as long as elements are less than or equal to the pivot
            while (i <= high && arr[i] <= pivotValue) {
                i++;
            }

            // Move j to the left as long as elements are greater than or equal to the pivot
            while (j >= low && arr[j] > pivotValue) {
                j--;
            }

            // Swap elements at i and j if i is less than j
            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);

        return j;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
