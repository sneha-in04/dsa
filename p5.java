package dsa;

public class p5 {
    public static void main(String[] args) {
       
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                char ch = (char) ('A' + i); 
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
}
