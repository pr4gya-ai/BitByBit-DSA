class Solution {
    public int splitArray(int[] nums, int k) {
       int mini=0;
       int maxi=0;

       for(int num: nums){
        mini=Math.max(mini, num);
        maxi+=num;
       }

       //find mid:
       int left=mini;
       int right=maxi;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (valid(nums, k, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean valid(int []nums, int k, int sum){
        int curr=0;
        int p=1;
        for(int i=0; i<nums.length; i++){
            if(curr + nums[i]> sum){
                curr=0;
                p++;
                if(p>k) return false;
            }
            curr+=nums[i];
        }
        if(p<=k) return true;
        return false;
    }
}