package dsa;
import java.util.*;

public class passingbyfunction {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr= new int[3];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        } 
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] a){
        a[0]=1;
    }
    
}
