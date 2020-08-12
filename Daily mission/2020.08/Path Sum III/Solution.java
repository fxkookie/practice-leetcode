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
    int paths = 0;
    public int pathSum(TreeNode root, int sum) {
        traversal(root,sum);
        return paths;
    }
    public void find(TreeNode root, int sum) {
       if(root != null){
           if(sum-root.val == 0){
               paths += 1;
           }
           find(root.left,sum-root.val);
           find(root.right,sum-root.val);
       }
    }
    public void traversal(TreeNode root,int sum){
        if(root!=null){
            find(root,sum);
            traversal(root.left,sum);
            traversal(root.right,sum);
        }
    }

}
