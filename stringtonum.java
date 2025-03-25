package dsa;

public class stringtonum {
    public static void main(String[] args) {
        String name="sneha";
        String t="";
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);//explicit conversion
            int n= (int) ch -(int)'a' +1;
            t+=String.valueOf(n);
        }
        System.out.println(t);
        int len=t.length();
        int num=Integer.valueOf(t);
        System.out.println(num);
        int k=1;
        for(int j=0;j<k;j++){
            int sum=0;
            while(num!=0){
                int a=num%10;
                sum=sum+a;
                num=num/10;
            }
            num=sum;
        }
        System.out.println(num);
    }
    
}
