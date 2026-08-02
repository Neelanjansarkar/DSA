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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
        return sumof(root,low,high,sum);
    }
    public int sumof(TreeNode root,int lo,int hi,int sum){
        if(root==null)return 0;
        if(lo<=root.val && hi>=root.val){
            sum=root.val+sumof(root.left,lo,hi,sum)+sumof(root.right,lo,hi,sum);
            return sum;
        }
        else if(root.val<lo)return sumof(root.right,lo,hi,sum);
        else{
            return sumof(root.left,lo,hi,sum);
        }
    }
}