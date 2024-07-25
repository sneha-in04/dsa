package dsa.string;

import java.util.Arrays;

public class reversestring {
    public static void main(String[] args) {
        String n="  hello world  ";
        String name=n.trim().replaceAll("//s", " ");
        String[] ans=name.split(" ");
        int nm=ans.length;
        System.out.println(nm);
        System.out.println(Arrays.toString(ans));
        
    }
    static void reve(String name){
        return;
    }
}
