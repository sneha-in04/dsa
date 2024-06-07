package dsa.search;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr={45,12,34,-9,56};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            while(j>0){
                int k=j-1;
                if(arr[j]<arr[k]){
                    swap(arr,j,k);
                }
                else{
                    break;
                }
                j--;
            }
        }
    }
    static void swap(int[] arr,int j,int k){
        int temp=arr[j];
        arr[j]=arr[k];
        arr[k]=temp;
    }
    
}
