/*
 * Problem: Two Sum
 *
 * Description:
 * Given an array of integers and a target value, this program
 * finds two indices such that the numbers at those indices add
 * up to the target.
 *
 * Example:
 * Input:  nums = {2, 7, 11, 15}, target = 9
 * Output: Indices: 0 and 1
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + " and " + i);
                return;
            }

            map.put(nums[i], i);
        }

        System.out.println("No solution found.");
    }
}
