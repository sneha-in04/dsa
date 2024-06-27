package dsa.bitwise_operator;

public class Oe {
    public static void main(String[] args) {
        int n=90;
        System.out.println(isodd(n));

        
    }
    static boolean isodd(int n){
        return (n&1)==1;
    }
    
}
