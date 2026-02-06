class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return generate(nums, nums.length);
    }
    
    public List<List<Integer>> generate(int [] nums, int n){
       if(n==0){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        return ans;
       } 
       List<List<Integer>> faith = generate(nums, n-1);
       List<List<Integer>> result = new ArrayList<>(faith);

       int num = nums[n-1];
       for(List<Integer> list: faith){
           List<Integer> newList = new ArrayList<>(list);
           newList.add(num);
           result.add(newList);
       }
       return result;
    }
}