package dsa;

import java.util.Arrays;

public class missingnumber {
    public static void main(String[] args) {
        int[] nums= {0,2};
        int max = nums[0];
        for (int i = 1; i < nums.length; i++){
            if(nums[i] > max);
            max = nums[i];
        }
        int map[] = new int[max + 1];
        for (int i = 0; i < nums.length; i++){
            map[nums[i]]++;
        }
        System.out.println(Arrays.toString(map));


  
    }
    
}
