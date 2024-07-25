package dsa.recursion;
import java.util.*;
//printing number using recursion

public class num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n;
        n=sc.nextInt();
        fun(n);
        funrev(n);
        
    }
    static void fun(int n){
        if(n==1){
            System.out.println(1);
            return;

        }
        System.out.println(n);
        fun(n-1);
    }
    static void funrev(int n){
        if(n==1){
            System.out.println(1);
            return;

        }
        fun(n-1);
        System.out.println(n);
    }
    
}
