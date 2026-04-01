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
    public boolean sameTrees (TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if ((left == null && right != null) ||(left != null && right == null)) return false;
        //traverse outside
        if (!sameTrees(left.left, right.right)) return false;        
        //check curr
        if (left.val != right.val) return false;
        //traverse inside
        if (!sameTrees(left.right, right.left)) return false;
        return true;
    }

    public boolean isSymmetric(TreeNode root) {
        //recursive traversal of half the tree, 2 currs at a time
        return sameTrees(root, root);         
    }
}