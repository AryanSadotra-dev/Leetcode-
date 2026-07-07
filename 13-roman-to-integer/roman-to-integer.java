class Solution {
    public int romanToInt(String s) {

        char[] ch = s.toCharArray();
        int ans = 0;
        for (int i = 0; i < ch.length; i++) {
            int current = 0;
            int next = 0;
            switch (ch[i]) {
                case 'I':
                    current = 1;
                    break;
                case 'V':
                    current = 5;
                    break;
                case 'X':
                    current = 10;
                    break;
                case 'L':
                    current = 50;
                    break;
                case 'C':
                    current = 100;
                    break;
                case 'D':
                    current = 500;
                    break;
                case 'M':
                    current = 1000;
                    break;
            }

            if (i + 1 < ch.length) {
                switch (ch[i + 1]) {
                    case 'I':
                        next = 1;
                        break;
                    case 'V':
                        next = 5;
                        break;
                    case 'X':
                        next = 10;
                        break;
                    case 'L':
                        next = 50;
                        break;
                    case 'C':
                        next = 100;
                        break;
                    case 'D':
                        next = 500;
                        break;
                    case 'M':
                        next = 1000;
                        break;
                }
            }

            if (current < next) {
                ans -= current;
            } else {
                ans += current;
            }
        }
        return ans;
    }
}