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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return helper(preorder,inorder,0,n-1,0,n-1);
    }
    public TreeNode helper(int[]preorder,int[]inorder,int prelo,int prehi,int inlo,int inhi){
        if(prelo>prehi||inlo>inhi)return null;
        TreeNode root=new TreeNode(preorder[prelo]);
        int idx=inlo;
        while(inorder[idx]!=preorder[prelo])idx++;
        int lefSize=idx-inlo;
          int leftSize = idx - inlo;

        root.left = helper(preorder, inorder,
                           prelo + 1,
                           prelo + leftSize,
                           inlo,
                           idx - 1);

        root.right = helper(preorder, inorder,
                            prelo + leftSize + 1,
                            prehi,
                            idx + 1,
                            inhi);

        return root;
    }
}