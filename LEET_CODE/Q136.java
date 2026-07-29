// package LEET_CODE;

import java.util.HashMap;
import java.util.Map;

/**
 * Q136
 */
public class Q136 {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num ,map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() == 1) {
            System.out.println(entry.getKey());
            break; // Stops after finding the first one
        }
    }
        // System.out.println(map);
    }
}