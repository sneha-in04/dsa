package dsa;

public class lcm {
    public static void main(String[] args) {
        l o=new l();
        o.lcm(12,24);
        
    }
    
}
class l{
    int b;
    void lcm(int n,int m){
        int c=1;
        if(n<m){
             b=n;
        }
        else{
            b=m;
        }
        for(int i =1;i<=b;i++){
            if((m%i==0) &&(n%i==0)){
                if(c<i){
                    c=i;

                }
                

            }
        }
        System.out.println(c);
    }
}
