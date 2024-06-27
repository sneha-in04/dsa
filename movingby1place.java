package dsa;

import java.util.Arrays;

public class movingby1place {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,5};
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));

    }
    
}
