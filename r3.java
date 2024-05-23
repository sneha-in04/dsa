package dsa;

import java.util.Scanner;

public class r3 {
    public static void main(String[] args) {
        m r1=new m();
        r1.num(1,10);
        r1.rnum(1,10);

        
    }
    
}
class m{
    int n;
    int i;
    void num(int i ,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        num(i+1,n);

    }
    void rnum(int i,int n){
        if(n<i){
            return;
        }
        System.out.println(n);
        rnum(i,n-1);
    }
}
