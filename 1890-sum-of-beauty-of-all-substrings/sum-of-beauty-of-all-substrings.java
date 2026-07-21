class Solution {
    public int beautySum(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String str = s.substring(i, j);
                int[] arr = new int[26];
                for (int k = 0; k < str.length(); k++) {
                    arr[str.charAt(k) - 'a']++;
                }
                int max = 0;
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (arr[k] > 0) {
                        max = Math.max(max, arr[k]);
                        min = Math.min(min, arr[k]);
                    }
                }
                ans += (max - min);
            }
        }
        return ans;
    }
}