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
    public List<Integer> copyof(List<Integer>arr){
        List<Integer> lst=new ArrayList<>();
        for(int ele:arr){
            lst.add(ele);
        }
        return lst;
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        helper(root,targetSum,arr,ans);
        return ans;
    }
    public void helper(TreeNode root,int x,List<Integer> arr,List<List<Integer>>ans){
        if(root==null)return;
        if(root.left==null && root.right==null){
            if(x==root.val){
                arr.add(root.val);
                ans.add(arr);
            }
            return;
        }
        arr.add(root.val);
        List<Integer>arr1=copyof(arr);
        List<Integer>arr2=copyof(arr);
        helper(root.left,x-root.val,arr1,ans);
        helper(root.right,x-root.val,arr2,ans);
    }
}