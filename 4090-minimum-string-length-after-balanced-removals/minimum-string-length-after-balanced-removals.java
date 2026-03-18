class Solution {
    public int minLengthAfterRemovals(String s) {
        int n = s.length();
        int[] freq = new int[26];
        
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        
        int maxFreq = 0;
        for(int f : freq){
            maxFreq = Math.max(maxFreq, f);
        }    
        return Math.max(0, maxFreq - (n - maxFreq));
    }
}