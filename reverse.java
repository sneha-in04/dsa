package dsa;
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[5];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        int ans=search(arr, 10);
        System.out.println(ans);
        
        

    }
    //reverse code
    static void  reverse(int[] arr){
        int l=0;
        int r=(arr.length)-1;
        while(l<r){
            swap(arr,l, r);
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
        
    }
    //swap code
    static void swap( int[] arr,int a1, int b1){
        int temp=arr[a1];
        arr[a1]=arr[b1];
        arr[b1]=temp;
        
    }
    //linear search code
    static int search(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;

    }
    
}
