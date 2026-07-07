class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        char[] ch = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        int n = ch.length - 1;
        for (int i = n; i >= 0; i--) {
            if (ch[i] == ' ') {
                for (int j = i + 1; j <= n; j++) {
                    ans.append(ch[j]);
                }
                ans.append(' ');
                while (i >= 0 && ch[i] == ' ') {// for skip spaces 
                    i--;
                }
                n = i;
                i++;
            }
        }

        for (int j = 0; j <= n; j++) {
            ans.append(ch[j]);
        }
        return ans.toString();
    }
}