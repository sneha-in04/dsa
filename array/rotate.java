package dsa.array;

import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 4}, {3, 9, 3}, {4, 1, 2}};
        int[][] ans = r(arr);
        System.out.println(Arrays.deepToString(ans)); 
    }

    static int[][] r(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length; 
        int[][] ans = new int[c][r]; 
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[j][r - 1 - i] = matrix[i][j];
            }
        }
        return ans;
    }
}
