import java.util.HashSet;

public class UnionOfTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 6, 7};

        HashSet<Integer> set = new HashSet<>();

        // Add elements of first array
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        // Add elements of second array
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        // Print union
        System.out.println("Union of two arrays:");

        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
