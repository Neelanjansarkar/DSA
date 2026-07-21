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
    public boolean isSymmetric(TreeNode root) {
        return ismirror(root.left,root.right);
    }
    public static boolean ismirror(TreeNode a,TreeNode b){
        // if(a!=null && b==null) return false;
        // if(a==null && b!=null) return false;
        // if(a!=null && b!=null) return false;
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        if(a.val!=b.val) return false;
        boolean ismirror_left=ismirror(a.left,b.right);
        boolean ismirror_right=ismirror(a.right,b.left);
        return ismirror_left && ismirror_right;
    }
}