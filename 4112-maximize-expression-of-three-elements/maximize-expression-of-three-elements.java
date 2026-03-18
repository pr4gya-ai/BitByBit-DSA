import java.util.Arrays;

class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        // a + b - c
        return nums[n-1] + nums[n-2] - nums[0];
    }
}