class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int n = s.length();

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
