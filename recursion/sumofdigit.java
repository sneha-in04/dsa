package dsa.recursion;

public class sumofdigit {
    public static void main(String[] args) {
        int n=1234;
        int ans=digitsum(n);
        System.out.println(ans);
    
    }
static int rem(int n){
    if(n==0){
        return 0;
    }
    int k=n%10;
    int a=n/10;
    return k+rem(a);
}
static int digitsum(int n){
    if(n==0){
        return 0;
    }

    else{
        return (n%10)+rem(n/10);
    }
}
}
