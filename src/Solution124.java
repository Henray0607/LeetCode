public class Solution124 {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        find(root);
        return max;
    }
    public int find(TreeNode node) {
        if (node == null)
            return 0;
        // 选取贡献值大于0的节点
        int left = Math.max(find(node.left), 0);
        int right = Math.max(find(node.right), 0);
        max = Math.max(max, left + right + node.val);
        return node.val + Math.max(left, right);
    }
}
