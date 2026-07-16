/*
 * Problem: Remove Duplicates from Sorted Array
 *
 * Description:
 * Given a sorted array, remove the duplicate elements in-place
 * such that each unique element appears only once. The program
 * returns the count of unique elements and prints the modified array.
 *
 * Example:
 * Input:  {1, 1, 2, 2, 3, 4, 4, 5}
 * Output: Length = 5
 *         Array = 1 2 3 4 5
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        int k = removeDuplicates(arr);

        System.out.println("Number of Unique Elements: " + k);

        System.out.print("Modified Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }
}
