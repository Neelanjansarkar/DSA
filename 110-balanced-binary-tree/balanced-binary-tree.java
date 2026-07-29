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
    static boolean ans;
    public int levels(TreeNode root){
        if(root==null) return 0;
        int lst=levels(root.left);
        int rst=levels(root.right);
        if(Math.abs(lst-rst)>1)ans=false;
        return 1+Math.max(lst,rst);
    }
    public boolean isBalanced(TreeNode root) {
        ans=true;
        levels(root);
        return ans;
        
    }
    // public boolean balance(TreeNode root){
    //     if(root==null)return true;
    //     int lst=levels(root.left);
    //     int rst=levels(root.right);
    //     if(Math.abs(lst-rst)>1)
    //         return false;
    //     return balance(root.left) && balance(root.right);
    // }
    // public int levels(TreeNode root){
    //     if(root==null){
    //         return 0;
    //     }
    //     return Math.max(levels(root.left),levels(root.right))+1;
    // }
}