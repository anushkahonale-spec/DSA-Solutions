import java.util.*;

public class UnionOfTwoArrays {

    public static int[] union(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        // Add elements of first array
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        // Add elements of second array
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        // Convert HashSet to array
        int[] result = new int[set.size()];
        int index = 0;

        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 6, 7};

        int[] ans = union(arr1, arr2);

        System.out.println("Union of two arrays:");

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}

Union of two arrays:
1 2 3 4 5 6 7
