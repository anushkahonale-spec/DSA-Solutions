import java.util.ArrayList;

public class MajorityElementNby3 {

    public static void main(String[] args) {

        int[] arr = {3, 2, 3, 2, 2, 1, 1, 1};

        int candidate1 = 0;
        int candidate2 = 1;

        int count1 = 0;
        int count2 = 0;

        // Find possible candidates
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == candidate1) {
                count1++;
            } 
            else if (arr[i] == candidate2) {
                count2++;
            } 
            else if (count1 == 0) {
                candidate1 = arr[i];
                count1 = 1;
            } 
            else if (count2 == 0) {
                candidate2 = arr[i];
                count2 = 1;
            } 
            else {
                count1--;
                count2--;
            }
        }

        // Verify candidates
        ArrayList<Integer> result = new ArrayList<>();

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == candidate1) {
                count1++;
            }

            if (arr[i] == candidate2) {
                count2++;
            }
        }

        int n = arr.length;

        if (count1 > n / 3) {
            result.add(candidate1);
        }

        if (count2 > n / 3 && candidate2 != candidate1) {
            result.add(candidate2);
        }

        System.out.println("Majority elements are: " + result);
    }
}
