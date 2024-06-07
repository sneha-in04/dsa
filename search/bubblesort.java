package dsa.search;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int [] arr ={4,1,9,3,5};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    static void swap( int[] arr,int a1, int b1){
        int temp=arr[a1];
        arr[a1]=arr[b1];
        arr[b1]=temp;
        
    }
    //line
    static void bubblesort(int[] nums){
        int end=nums.length-1;
        for(int i=0;i<end;i++){
            for(int j=1;j<=end-i;j++){
                if(nums[j-1]>nums[j]){
                    swap(nums, j-1, j);
                }
            }
        }

    }
    
}
