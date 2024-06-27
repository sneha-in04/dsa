package dsa;

public class potd {
    public static void main(String[] args) {
        int c = 2;
        System.out.println(judgeSquareSum(c)); // should be static to be called here
    }

    public static boolean judgeSquareSum(int c) {
        for (int i = 0; i * i <= c; i++) {
            int b = c - i * i;
            int sqrtB = (int) Math.sqrt(b);
            if (sqrtB * sqrtB == b) {
                return true;
            }
        }
        return false;
    }
}
