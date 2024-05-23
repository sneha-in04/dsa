package dsa;
import java.util.*;

public class sumFunction {
    public static void main(String[] args) {
        function fc=new function();
        //fc.sum();
        //int a= 10;
        //int b= 20;
        //fc.swap(a,b);
        //System.out.println(a+" "+b);
        String name="sneha ";
        fc.changename(name);
        System.out.println("name is "+ name);

        
    }
    
}
class function {
    void sum(){
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("enetr the 1st number");
        a=sc.nextInt();
        System.out.println("enter a 2nd number");
        b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum of number is "+sum);


    }
    void swap(int a ,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    void changename(String name){
        name="mithu";
        System.out.println(name);// creating a new object
    }
}
