class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int val:nums){
            if(!set.contains(val)){
                set.add(val);
            }
            else{
                return true;
            }
        }
        return false;
    }
}