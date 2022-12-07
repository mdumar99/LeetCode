/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        int sum = 0;
        while(!stack.isEmpty()){
            TreeNode n = stack.pop();
            if(n.right != null) stack.push(n.right);
            if(n.left != null) stack.push(n.left);
            if(low<=n.val && n.val<=high) sum += n.val;
        }

        return sum;
    }
}