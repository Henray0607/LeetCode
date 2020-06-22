public class Solution110 {
    private boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return flag;
    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(root.left) + 1;
            int rightDepth = maxDepth(root.right) + 1;
            if (Math.abs(leftDepth - rightDepth) > 1) {
                flag = false;
            }
            return Math.max(leftDepth, rightDepth);
        }
    }
}
