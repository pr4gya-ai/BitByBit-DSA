class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p = 1;
        int n = nums.length;
        int zero = 0;

        for(int x:nums){
            if(x!=0){
                p*=x;
            }
            else{
                zero++;
            }
        }
        int [] ans = new int[n];
        if(zero>=2){
            return ans;
        }
        for(int i=0; i<n; i++){
            if(zero==1 && nums[i] != 0){
                ans[i] = 0;
            }
            else if(zero==1 && nums[i] == 0)
            {
               ans[i] = p;
            }
            else{
                ans[i]=p/nums[i];
            }
        }
        return ans;
    }
}