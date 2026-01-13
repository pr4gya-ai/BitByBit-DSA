class Solution {
    public int compress(char[] chars) {

        int left = 0;
        int k = 0;
        int n = chars.length;

        for (int i = 1; i < n; i++) {

            if (chars[i - 1] != chars[i]) {
                chars[k++] = chars[i - 1];
                if (i - left != 1) {
                    String s = String.valueOf(i - left);
                    for (int j = 0; j < s.length(); j++) {
                        chars[k++] = s.charAt(j);
                    }
                }
                left = i;
            }
        }
        chars[k++] = chars[n - 1];

        if (n - left != 1) {
            String s = String.valueOf(n - left);
            for (int j = 0; j < s.length(); j++) {
                chars[k++] = s.charAt(j);
            }
        }

        return k;
    }
}
