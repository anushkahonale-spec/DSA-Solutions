public class InsertionInSortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9};
        int n = 5; // current number of elements
        int element = 6; // element to insert

        // Increase array size by 1
        int[] newArr = new int[n + 1];

        int i = n - 1;

        // Shift elements greater than element to the right
        while (i >= 0 && arr[i] > element) {
            newArr[i + 1] = arr[i];
            i--;
        }

        // Insert element at correct position
        newArr[i + 1] = element;

        // Copy remaining elements
        for (int j = 0; j <= i; j++) {
            newArr[j] = arr[j];
        }

        // Print updated array
        System.out.println("Array after insertion:");

        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
Array after insertion:
1 3 5 6 7 9
