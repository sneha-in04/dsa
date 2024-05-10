//using recursion print 1 to n
package dsa;

import java.util.Scanner;

public class r2 {
    public static void main(String[] args) {
        r l=new r();
        l.input();
        l.n();
        
    }
    
}
class r{
    int c=1;
    int N;
    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        N=sc.nextInt();  
    }  
    void n(){
        if(c==(N+1)){
            return;
        }
        System.out.println(c);
        c++;
        n();
        

    }
}