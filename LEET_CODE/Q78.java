package LEET_CODE;

import java.util.*;

public class Q78 {
    public static void main(String[] args) {


        int[] nums = {1, 2, 3};

        List<List<Integer>> ans = subsets(nums);

        System.out.println(ans);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    static void backtrack(List<List<Integer>> resultSets,List<Integer> tempSet, int[] nums, int start) {
        
        // Add the set to result set
        resultSets.add(new ArrayList<>(tempSet));
        for(int i = start; i < nums.length; i++) {
            
            // Case of including the number
            tempSet.add(nums[i]);

            // Backtrack the new subset
            backtrack(resultSets, tempSet, nums, i + 1);

            // Case of not-including the number
            tempSet.remove(tempSet.size() - 1);
        }
    }
}