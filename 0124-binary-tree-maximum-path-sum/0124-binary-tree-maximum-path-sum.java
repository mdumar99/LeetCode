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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        pathsum(root);
        return maxSum;
    }
    public int pathsum (TreeNode root){
        if(root==null){
            return 0;
        }
        int ls = Math.max(0, pathsum(root.left));
        int rs  = Math.max(0, pathsum(root.right));
        if((ls + rs + root.val) > maxSum)
            maxSum = ls + rs + root.val;
        return root.val + Math.max(rs, ls);
    }
}