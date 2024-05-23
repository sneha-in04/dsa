package dsa;

public class sum_recursion {
    public static void main(String[] args) {
        ram w=new ram();
        //w.nsum(10);
        System.out.println(w.sum1(23));
        System.out.println(w.fac(9));
        int[] arr={2,3,4,5,6,7,8};
        

    }
    
}
class ram{
    int c=0;
    void nsum(int n){
        if(n==0){
            System.out.println(c);
            return;
        }
        c=c+n;
        nsum(n-1);
       // System.out.println(c); this print the sum for entire recurrion value
        //we will print it when the condition break so put it inn if condition statement

    }
    //other approach two variable approach
    int sum1(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum1(n - 1);
        }
    }
    int fac(int y){
        if(y==0){
            return 1;
        }
        return(y*fac(y-1));
    }
    void reverse(int l, int r){
        if(l>=r){
            return;
        }
        swap(a[l],a[r]);
        reverse(l+1, r-1);

    }
}
