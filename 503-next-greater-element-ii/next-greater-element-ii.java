class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            ans[i] = -1;
        }

        for(int i=0; i<2*n-1; i++){
            int idx = i%n;

            while(!stack.isEmpty() && nums[idx] > nums[stack.peek()]){
                ans[stack.pop()] = nums[idx];
            }
            if(i<n){
                stack.push(idx);
            }
        }
        return ans;
    }
}