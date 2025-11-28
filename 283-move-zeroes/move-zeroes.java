class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeros = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                nums[nonZeros++]=nums[i];
            }
        }
        
        while(nonZeros<n){
            nums[nonZeros++]=0;
        }

    }
}