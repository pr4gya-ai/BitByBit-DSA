class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        return helpFunction(nums, 0, nums.length - 1);
    }

    public TreeNode helpFunction(int[] arr, int i, int j){

        if(i > j){
            return null;
        }

        int mid = (i + j) / 2;

        TreeNode root = new TreeNode(arr[mid]);

        root.left = helpFunction(arr, i, mid - 1);
        root.right = helpFunction(arr, mid + 1, j);

        return root;
    }
}