package dsa;

public class rev {
    public static void main(String[] args) {
        String s="sneha";
        System.out.println(reverse(s));
    }
    static String reverse(String s){
        int i=0;
        int l=s.length();
        while(i<l){
            swap(s,i,l);
            i++;
            l--;
        }
        return s;
    }
    static void swap(String s,int i,int l){
        char temp=s.charAt(i);
        char a=s.charAt(l);
        char b=temp;
    }
    
}
