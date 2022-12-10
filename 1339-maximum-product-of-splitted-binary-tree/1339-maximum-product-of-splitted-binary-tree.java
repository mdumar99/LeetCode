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
    long res = 0;
    long sum = 0;
    long cur;
    public int maxProduct(TreeNode root) {
        sum = dfs(root);
        dfs(root);
        return (int)(res % (int)(1e9 + 7));
    }
    
    public long dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        
        cur = root.val + dfs(root.left) + dfs(root.right);
        res = Math.max(res, cur*(sum-cur));
        return cur;
    }
}