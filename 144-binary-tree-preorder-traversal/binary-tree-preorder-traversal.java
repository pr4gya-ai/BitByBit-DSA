class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    public void preorder(TreeNode root, List<Integer> result){
        if(root == null) return;

        result.add(root.val);        // visit root
        preorder(root.left, result); // go left
        preorder(root.right, result);// go right
    }
}