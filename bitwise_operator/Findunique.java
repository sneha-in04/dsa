package dsa.bitwise_operator;

public class Findunique {
    public static void main(String[] args) {
        int[] arr={2,2,3,1,1};
        System.out.println(ans(arr));
        
    }
    static int ans(int[] arr){
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
    
}
