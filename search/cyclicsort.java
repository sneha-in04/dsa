package dsa.search;

import java.util.ArrayList;
import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr={1,2,4,1,3};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList <Integer> finddup= new ArrayList<Integer>();
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                finddup.add(j);
            }
            
        }
        return finddup;


        
    }
    static void cycle(int[] arr){
        /*for(int i=0;i<arr.length;i++){
            if(arr[i]<arr.length && arr[i]!=i+1){
                while(arr[i]!=i+1){
                    int k=arr[i];
                    swap(arr, i,k-1 );

                }
               
            }
            

        }*/
        int i=0;
        while(i<arr.length){
            int c=arr[i]-1;
            if(  arr[i]!=arr[c]){
                swap(arr,i,c);
            }
            
            else{     
                i++;
            }
        }

    }
    static void swap(int arr[],int i,int val){
        int temp=arr[i];
        arr[i]=arr[val];
        arr[val]=temp;
    }
    
}
