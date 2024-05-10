package dsa;
import java.util.Scanner;
public class d {
    public static void main(String[] args) {
        Solution s= new Solution();
        int a=s.dataTypes("Long");
        System.out.println(a);
        
    }
    
}
class Solution {
    public static int dataTypes(String type) {
        
       
       if(type=="Integer"){
           return 4;
       }
       else if(type=="Long"){
           return 8;
       }
       else if(type=="Float"){
           return 4;

       }
       else if(type=="Double"){
           return 8;
       }
       else if(type=="Character"){
           return 1;
       }
       return -1;
      
    }
}
