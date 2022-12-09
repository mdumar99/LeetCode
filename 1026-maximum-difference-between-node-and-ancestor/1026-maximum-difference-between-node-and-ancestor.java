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
    int diff = 0;
    public int maxAncestorDiff(TreeNode root) {
        validate(root);
        return diff;
    }
    
    int[] validate(TreeNode node){
        if(node==null) return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        if(node.left==null && node.right==null) return new int[]{node.val, node.val};
        
        int[] left = validate(node.left);
        int[] right = validate(node.right);
        
        int min = Math.min(left[0],right[0]);
        int max = Math.max(left[1],right[1]);
        
        diff = Math.max(diff, Math.max(Math.abs(min-node.val),Math.abs(max-node.val)));
        
        min = Math.min(min,node.val);
        max = Math.max(max,node.val);
        
        return new int[]{min,max};
    }
}