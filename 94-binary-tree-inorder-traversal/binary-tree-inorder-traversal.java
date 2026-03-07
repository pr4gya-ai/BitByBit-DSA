class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public void inorder(TreeNode root, List<Integer> result) {
        if(root == null) return;

        inorder(root.left, result);   // firstly go left
        result.add(root.val);         // secondly visit root
        inorder(root.right, result);  // lastly go right
    }
}