package dsa;
import java.util.Arrays;

public class argument {
    public static void main(String[] args) {
        fun(2,3,4);
        System.out.println(isprime(9));
        
    }
    static void  fun(int...v){
        System.out.println(Arrays.toString(v));
        
    }
    public static boolean isprime(int number){
        int c=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                c++;

            }
        }
        if(c==2){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
