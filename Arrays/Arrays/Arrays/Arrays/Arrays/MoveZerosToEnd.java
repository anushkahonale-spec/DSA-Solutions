/*
 * Problem: Move Zeros to End
 *
 * Description:
 * Given an array, move all the zeros to the end while
 * maintaining the relative order of the non-zero elements.
 *
 * Example:
 * Input:  {1, 0, 2, 0, 3, 4}
 * Output: {1, 2, 3, 4, 0, 0}
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 4};

        moveZeros(arr);

        System.out.print("Modified Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeros(int[] arr) {

        int j = -1;

        // Find the first zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return;
        }

        // Move non-zero elements forward
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
