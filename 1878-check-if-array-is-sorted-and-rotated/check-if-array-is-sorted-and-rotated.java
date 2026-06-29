import java.util.Arrays;

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;

        // Create a copy of the original array
        int[] arr = nums.clone();

        // Sort the copy
        Arrays.sort(arr);

        // Try every possible rotation
        for (int k = 0; k < n; k++) {
            boolean match = true;

            for (int i = 0; i < n; i++) {
                if (nums[(i + k) % n] != arr[i]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return true;
            }
        }

        return false;
    }
}