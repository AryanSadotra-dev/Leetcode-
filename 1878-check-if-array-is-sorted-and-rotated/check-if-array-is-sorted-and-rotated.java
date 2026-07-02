class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        boolean sorted = true;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            return true;
        }
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }

            if (count > 1) {
                return false;
            }
        }

        return true;
    }
}