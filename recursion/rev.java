package dsa.recursion;

public class rev {
    public static void main(String[] args) {
        int n=35;
        int len=(int)(Math.log10(n)+1);
        double ans=revnum(n,len);
        System.out.println(ans);
    }
    /*static int  sum=0;
    static void revnum(int n){
        if(n==0){
            return;  
        }
        int rem=n%10;
        sum=sum*10+rem;
        revnum(n/10);
    }*/
    static double revnum(int n,int arg){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*Math.pow(10,arg-1)+ revnum(n/10,arg-1);

    }

}
