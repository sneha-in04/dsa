package dsa;

public class r1 {
    public static void main(String[] args) {
        recursion r= new recursion();
        r.name();
    }
    
}
class recursion{
    int c=0;
    void name(){
        if(c==5){
            return;
        }
        System.out.println("sneha");
        c++;
        name();

    }
}
