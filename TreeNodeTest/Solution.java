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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return root;
        }
        if(key > root.val){
            root.right = deleteNode(root.right,key);
        }
        else if(key < root.val){
            root.left = deleteNode(root.left,key);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            root.val = searchMin(root.right).val;
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }
    public TreeNode searchMax(TreeNode root){
        if(root.right != null){
            return searchMax(root.right);
        }
        else{
            return root;
        }
    }
    public TreeNode searchMin(TreeNode root){
        if(root.left != null){
            return searchMin(root.left);
        }
        else{
            return root;
        }
    }
    public TreeNode searchNode(TreeNode root,int key){
        if(root != null){
            if(root.val == key){
                return root;
            }
            else if(key > root.val){
                return searchNode(root.right,key);
            }
            else{
                return searchNode(root.left,key);
            }
        }
        else{
            return null;
        }
    }
}
