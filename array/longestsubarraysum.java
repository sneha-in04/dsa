package dsa.array;

import java.util.HashMap;

public class longestsubarraysum {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,1,3};
        int a=op_nlsum(arr, 7);
        System.out.println(a);
    }
    //brute force approach
    static int lsum(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            int s=0;
            int len=0;
            for(int j=i;j<arr.length;j++){
                s=s+arr[j];
                len=j-i+1;
                if(s==k){
                    int a=(int)Math.max(len,j-i+1);
                    return a;
                }

            }
        }
        return -1;
    }
    //optimised code
    static int op_lsum(int[] nums,int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int len=0;
        int s=0;
        for(int i=0;i<nums.length;i++){
            
            int tem=s;

            s=s+nums[i];
            map.put(s, map.getOrDefault(s, 0) + 1);
            if(s==k){
                 len=i+1;

            }
            else if(s-tem==k){
                if(i>len){
                    len=i;
                }
            }
            return len;
        }
        return -1;

    }
    static int op_nlsum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0;
        int s = 0; // To keep track of the cumulative sum

        for (int i = 0; i < nums.length; i++) {
            s += nums[i];

            if (s == k) {
                len = i + 1;
            } else if (map.containsKey(s - k)) {
                len = Math.max(len, i - map.get(s - k));
            }

            if (!map.containsKey(s)) {
                map.put(s, i);
            }
        }

        return len;
    }
    
}
