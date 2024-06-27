package dsa.hashing;

import java.util.HashMap;

public class HashMapExample {  // Renamed the class to follow Java naming conventions
    public static void main(String[] args) {
        int[] arr = {2, 9, 2, 2, 2, 2, 7};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        if (map.containsKey(1)) {
            System.out.println(map.get(1));
        }
    }
}
