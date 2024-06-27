package dsa.saturday;

import java.util.HashMap;

public class majorityelement {
    public static void main(String[] args) {
        int[] arr={2,1,1,1,2,2,2};
        int num=major(arr);
        System.out.println("the majority element is:"+ num);
        
    }
    static int major(int[] arr){
      HashMap<Integer, Integer> map = new HashMap<>();
      int major=arr.length/2;
      for(int num:arr){
        map.put(num,map.getOrDefault(num,0)+1);
        if(map.get(num)>major){
            return num;
          }

      }
    
      return -1;

    }
    
}
