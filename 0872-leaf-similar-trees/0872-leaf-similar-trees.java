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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();
        Stack<Integer> leaf1 = new Stack<Integer>();
        Stack<Integer> leaf2 = new Stack<Integer>();

        st1.push(root1);
        st2.push(root2);

        while(!st1.isEmpty() || !st2.isEmpty()){
            TreeNode a = (st1.isEmpty()) ? null : st1.pop();
            TreeNode b = (st2.isEmpty()) ? null : st2.pop();

            if(a!=null && a.right!=null) st1.push(a.right);
            if(b!= null && b.right!=null) st2.push(b.right);
            if(a!=null && a.left !=null) st1.push(a.left);
            if(b!= null && b.left !=null) st2.push(b.left);

            if(a!=null && a.right==null && a.left==null){
                leaf1.push(a.val);
            }
            if(b!=null && b.right==null && b.left==null){
                leaf2.push(b.val);
            }
        }

        while(!leaf1.isEmpty()&&!leaf2.isEmpty()){
            if(leaf1.peek()==leaf2.peek()){
                leaf1.pop();
                leaf2.pop();
            }else{
                return false;
            }
        }



        return (leaf1.isEmpty() && leaf2.isEmpty()) ? true : false;
    }
}