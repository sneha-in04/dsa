package dsa;

import java.util.Arrays;

public class digitarray {
    public static void main(String[] args) {
        String a="sneha";
        String[] al=a.split(",");
        String b=al[0];
        System.out.println(b);
        int[] arr={8,9};
        int k=arr.length;
        for(int i=k-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                System.out.println(Arrays.toString(arr));
                return;
            }
            arr[i]=0;
        }
        int[] n_a=new int[k+1];
        n_a[0]=1;
        System.out.println(Arrays.toString(n_a));
        

    }
    
}
