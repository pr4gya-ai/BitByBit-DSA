class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;
        k = k % n;
        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            tmp[(i + k) % n] = nums[i];
        }
        System.arraycopy(tmp, 0, nums, 0, n);
    }
}
