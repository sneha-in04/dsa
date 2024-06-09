package dsa;
//reverse is same as original string
public class palindrome {
    public static void main(String[] args) {
        String name="laokal";
        int l=0;
        int b=name.length();
        int r=b-1;
        while(l<r){
            if(name.charAt(l)==name.charAt(r)){
                l++;
                r--;
            }
            else{
                System.out.println("not a p");
                break;
            }
        }
        System.out.println(name);
        
    }
    
}
