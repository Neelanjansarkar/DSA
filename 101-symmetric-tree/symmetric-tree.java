class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        if(root.left == null || root.right == null) return false;

        TreeNode p = invert(root.right);
        TreeNode q = root.left;

        return isSame(p, q);
    }

    public static TreeNode invert(TreeNode root){
        if(root == null) return null;

        TreeNode temp = root.left;
        root.left = invert(root.right);
        root.right = invert(temp);

        return root;
    }

    public static boolean isSame(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;

        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }
}