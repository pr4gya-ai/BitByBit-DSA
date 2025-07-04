class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        set_char = set()
        left = 0
        len_max = 0

        for right in range(len(s)):
            while s[right] in set_char:
                set_char.remove(s[left])
                left+=1
            set_char.add(s[right])
            len_max = max(len_max, right - left + 1)

        return len_max