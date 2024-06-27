package dsa.maths;

public class prime {
    public static void main(String[] args) {
        int n=12;
        int p=3;
        //System.out.println(isprime(n));
        System.out.println(root(n,p));
        
       
    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
    static double root(int n,int p){
        int s=0;
        int end=n;
        double r=0.0;
        while(s<=end){
            int m=s+(end-s)/2;
            if(m*m==n){
                return m;
            }
            if(m*m>n){
                end=m-1;
            }else{
                s=m+1;
            }

        }
        double inc=0.1;
        for(int i=0;i<p;i++){
            while(r*r<=n){
                r+=inc;
            }
            r-=inc;
            inc=inc/10;
        }
        return r;
    }    
    
}
