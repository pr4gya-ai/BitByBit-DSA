class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        dup = set()
        for n in nums:
            if n in dup:
                return True
            dup.add(n)
        return False