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
    int maxvis=-1;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        right(root,ll,0);
        return ll;
    }
    public void right(TreeNode root,List<Integer> ll,int curr){
        if(root==null){
            return;
        }
        if(curr>maxvis){
            ll.add(root.val);
            maxvis=curr;
        }
        right(root.right,ll,curr+1);
        right(root.left,ll,curr+1);
    }
}