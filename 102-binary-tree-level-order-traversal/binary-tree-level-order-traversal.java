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
    public int levels(TreeNode root){
        if(root==null){
            return 0;
        }
        int a=levels(root.left);
        int b=levels(root.right);
        return Math.max(a,b)+1;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        int level=levels(root);
        for(int i=0;i<=level-1;i++){
            List<Integer> curr=new ArrayList<>();
            preorder(root,curr,i,0);
            ans.add(curr);
        }
        return ans;
    }
    public void preorder(TreeNode root,List<Integer> curr,int x,int lvl){
        if(root==null) return;
        if(lvl>x)return;
        if(lvl==x){
            curr.add(root.val);
        }
        preorder(root.left,curr,x,lvl+1);
        preorder(root.right,curr,x,lvl+1);

    }
    
}