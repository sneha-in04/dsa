package dsa.string;
import java.util.Arrays;

public class check_anagram {
    public static void main(String[] args) {
        String s="sneha";
        String t="nesha";
        char[] s1=s.toCharArray();
        Arrays.sort(s1); 
        char[] s2=t.toCharArray();
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2)){
            System.out.println("true");
        }
        System.out.println("false");
    }
    
}
