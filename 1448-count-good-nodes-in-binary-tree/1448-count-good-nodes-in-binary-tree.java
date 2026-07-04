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

    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    private int dfs(TreeNode root, int maxSoFar) {

        if (root == null) {
            return 0;
        }

        int count = 0;

        // Current node is good
        if (root.val >= maxSoFar) {
            count = 1;
        }

        // Update maximum value seen so far
        maxSoFar = Math.max(maxSoFar, root.val);

        // Visit left and right subtree
        int left = dfs(root.left, maxSoFar);
        int right = dfs(root.right, maxSoFar);

        return count + left + right;
    }
}