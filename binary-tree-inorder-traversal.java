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
    public void trackTraversal(TreeNode root, List<Integer> visited) {
        if (root == null) {
            return;
        }
        trackTraversal(root.left, visited);
        visited.add(root.val);
        trackTraversal(root.right, visited);
        return;        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> visited = new ArrayList<>();
        trackTraversal(root, visited);
        return visited; 
    }    
}