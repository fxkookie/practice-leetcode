public class Main{
  public static void main(String[] args){
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.left.left = new TreeNode(2);
    root.right = new TreeNode(6);
    root.right.right = new TreeNode(7);
    Solution s = new Solution();
    System.out.printf("%d",root.right.val);
    s.deleteNode(root,9);
    root.right = null;
    System.out.printf("%d",root.right.val);

  }
}
