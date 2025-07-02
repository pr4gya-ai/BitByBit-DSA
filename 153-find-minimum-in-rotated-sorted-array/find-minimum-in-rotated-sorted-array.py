class Solution(object):
    def findMin(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        min = float('inf')
        for num in nums:
            if num < min:
                min = num
        return min
        