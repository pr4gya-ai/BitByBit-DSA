class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] isPresent = new int[26];  

        for (char ch : sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {    
                isPresent[ch - 'a'] = 1;       
            }
        }
        for (int i = 0; i < 26; i++) {
            if (isPresent[i] == 0) {
                return false;
            }
        }
        return true; 
    }
}
