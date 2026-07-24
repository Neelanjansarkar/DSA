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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        int sd = dia(root.left) + dia(root.right);

        return Math.max(sd, Math.max(ld, rd));
    }
    public static int dia(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=dia(root.left);
        int right=dia(root.right);
        return Math.max(left,right)+1;
    }
}