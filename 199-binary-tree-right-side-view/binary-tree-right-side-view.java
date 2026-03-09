class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if(root == null) return answer;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int last = 0;
        while(q.size() != 0){
            int size = q.size();
            for(int i = 0; i<size; i++){
                TreeNode node = q.poll();
                last = node.val;
                if(node.left !=null) q.add(node.left);
                if(node.right !=null) q.add(node.right);
            }
            answer.add(last);
        }
        return answer;
    }
}