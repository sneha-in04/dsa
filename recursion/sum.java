package dsa.recursion;

public class sum {
    public static void main(String[] args) {
        int n=10;
        int ans=s(n);
        System.out.println(ans);

    }
    static int s(int n){
        if(n==1){
            return 1;
        }
        return n+s(n-1);
    }
    
}
