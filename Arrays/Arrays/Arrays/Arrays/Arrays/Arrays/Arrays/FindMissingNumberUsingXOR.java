/*
 * Problem: Find Missing Number Using XOR
 *
 * Description:
 * Given an array containing numbers from 1 to N with one
 * number missing, find the missing number using the XOR
 * operation.
 *
 * Example:
 * Input:  {1, 2, 4, 5}, N = 5
 * Output: Missing Number = 3
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class FindMissingNumberUsingXOR {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};
        int n = 5;

        int xor1 = 0;
        int xor2 = 0;

        // XOR of numbers from 1 to N
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        // XOR of array elements
        for (int num : arr) {
            xor2 ^= num;
        }

        int missingNumber = xor1 ^ xor2;

        System.out.println("Missing Number: " + missingNumber);
    }
}
