package dsa.maths;

import java.util.ArrayList;

public class factor {
    public static void main(String[] args) {
        int n = 40;
       // f_num(n);
        System.out.println(gcd(4,8));
    }

    static void f_num(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }
        for (int j = list.size() - 1; j >= 0; j--) {
            System.out.println(list.get(j));
        }
    }
    static int gcd(int a,int b){
        //base condition comes to be when reminder become zero
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
