/**
 * Problem: 1. Two Sum
 * Difficulty: Easy
 * 
 * Description:
 * Given an array of integers nums and an integer target, return indices of the two numbers
 * such that they add up to target. You may assume that each input would have exactly one
 * solution, and you may not use the same element twice.
 * 
 * Approach:
 * 1. Use a HashMap to store the numbers we've seen and their indices
 * 2. For each number, check if (target - current number) exists in the HashMap
 * 3. If found, return the indices of both numbers
 * 
 * Time Complexity: O(n) - we traverse the array once
 * Space Complexity: O(n) - we store at most n elements in the HashMap
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            
            numMap.put(nums[i], i);
        }
        
        return new int[] {}; // No solution found
    }
} 