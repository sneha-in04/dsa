package dsa.saturday;
//write a program to sort colors based on the code given red->0,green->1,blue->2.
import java.util.Arrays;
public class sortcolor {
    public static void main(String[] args) {
        int[] arr={1,1,0,2,0,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}
