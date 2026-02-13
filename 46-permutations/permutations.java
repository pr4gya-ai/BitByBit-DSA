class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return findPermute(nums.length - 1, nums);
    }

    public List<List<Integer>> findPermute(int i, int[] nums) {
        if (i == 0) {
            List<List<Integer>> base = new ArrayList<>();
            List<Integer> first = new ArrayList<>();
            first.add(nums[0]);
            base.add(first);
            return base;
        }
        List<List<Integer>> faith = findPermute(i - 1, nums);

        List<List<Integer>> result = new ArrayList<>();
        int el = nums[i];
        for (List<Integer> list : faith) {
            for (int j = 0; j <= list.size(); j++) {

                List<Integer> newList = new ArrayList<>(list);
                newList.add(j, el);
                result.add(newList);
            }
        }

        return result;
    }
}
