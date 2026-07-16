/*
 * Problem: Left Rotate Array by One Position
 *
 * Description:
 * Rotate the elements of an array to the left by one position.
 * The first element is moved to the last position.
 *
 * Example:
 * Input:  {1, 2, 3, 4, 5}
 * Output: {2, 3, 4, 5, 1}
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class LeftRotateArrayByOne {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;

        System.out.print("Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
