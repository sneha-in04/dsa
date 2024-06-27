package dsa.array;

import java.util.Arrays;

public class remobedup {
    public static void main(String[] args) {
        int[] arr={2,2,2,2,0};
        Arrays.sort(arr);
        int i=0;
        int j=1;
        int move=0;
        while(j!=arr.length){
            if(arr[i]==arr[j]){
                arr[j]++;
                i=j;
                j++;
                move++;
            }
            else if(arr[i]>arr[j]){
                int k=(arr[i]-arr[j]);
                arr[j]=arr[j]+1+k;
                i=j;
                j++;
                move=move+1+k;
            }
            else{
                i=j;
                j++;
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(move);


    }
    
}
