package dsa;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enyerrt");
        int n = sc.nextInt();

        // Closing the scanner
        sc.close();

        if (n < 0) {
            System.out.println("false");
            return;
        }

        int dup = n;
        int sum = 0;
        int id = 0;
        int c;

        // Handle the case when n is 0
        if (n == 0) {
            c = 1;
        } else {
            c = (int) (Math.log10(n) + 1);
        }

        while (n != 0) {
            id = n % 10;
            sum += Math.pow(id, c);
            n /= 10;
        }

        if (sum == dup) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}