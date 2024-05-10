package dsa;

public class p6 {  
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++){
            for(int j=i;j<5;j++){
                System.out.print( " ");
            }
            char ch='A';
            int b=(2*i+1)/2;
            for(int k=1;k<=(2*i+1);k++){
                System.out.print(ch);
                if(k<=b){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            for(int j=i;j<5;j++){
                System.out.print( " ");
            }
            System.out.println("");
            
        
    }
    
}
}
