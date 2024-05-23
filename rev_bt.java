package dsa;

public class rev_bt {
    public static void main(String[] args) {
        back_track bt= new back_track();
        
        bt.nrev(1,5);
    }
    
}
class back_track{
    void rev_bt(int i,int n){ //n,n input
        if(i<1){
            return;
        }
        rev_bt(i-1,n);
        System.out.println(i);
    }
    void nrev(int i,int n){//i,n input
        if(i>n){
            return;

        }
        nrev(i+1,n);
        System.out.println(i);
    }
}