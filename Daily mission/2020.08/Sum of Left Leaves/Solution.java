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
    int ans = 0;
    public int sumOfLeftLeaves(TreeNode root) {
       traversal(root);
        return ans;
    }
    public void traversal(TreeNode root){
        if(root == null){
            return;
        }
        traversal(root.right);
        if(root.left != null && root.left.right == null && root.left.left == null){
            ans += root.left.val;
        }
        traversal(root.left);
    }
}
