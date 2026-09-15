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
    public boolean isym(TreeNode left,TreeNode right){
        if(right== null || left==null){
            return right==left;
        }
        if(left.val!=right.val){
            return false;

        }
        return isym(left.left,right.right) && isym(right.left,left.right);

    }
    public boolean isSymmetric(TreeNode root) {
               return root==null || isym(root.left,root.right);

        
    }
}