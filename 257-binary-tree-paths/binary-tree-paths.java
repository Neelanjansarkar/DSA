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
    public List<String> binaryTreePaths(TreeNode root) {
        List <String> ans=new ArrayList<>();
        path(root,"",ans);
        return ans;
    }
    public void path(TreeNode root,String val,List<String> ans){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            val=val+root.val;
            ans.add(val);
            return;
        }
        path(root.left,val+root.val+"->",ans);
        path(root.right,val+root.val+"->",ans);
    }
}