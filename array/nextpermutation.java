package dsa.array;

import java.util.Arrays;

public class nextpermutation {
    public static void main(String[] args) {
        int[] arr={2,1,5,4,3,0,0};
        int n=arr.length;
        int indx=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                indx=i;
                break;
            }
        }
        if(indx==-1){
            int l=0;
            int r=n-1;
            while(l<r){
                swap(arr, l, r);
                l++;
                r--;
            }
            System.out.println(Arrays.toString(arr));

        }
        //someone just smaller than indx since after indx they are in sort oreder in descending order so we search from reverse
        for(int j=n-1;j>=indx;j--){
            if(arr[j]>arr[indx]){
                int temp=arr[j];
                arr[j]=arr[indx];
                arr[indx]=temp;
            }
            break;
        }
        int p=indx+1;
        int o=n-1;
        while(p<o){
            swap(arr, p, o);
            p++;
            o--;
        }
        System.out.println(Arrays.toString(arr));
        

    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    
}
