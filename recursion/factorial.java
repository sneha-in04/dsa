package dsa.recursion;
//factorial of a number using recursion

public class factorial {
    public static void main(String[] args) {
        int k=fact(5);
        System.out.println(k);
        
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    
}
