package Trees.MaxDepth;

import Trees.TreeNode;

/*

Given the root of a tree, return the max depth

Example

   Input:
         4
      2     7
    1   3
  8

Output: 4

 */
public class MaximumDepth {

    public int maxDepth(TreeNode root) {

        if (root == null) return 0;

        int depthLeft  = maxDepth(root.left) + 1;
        int depthRight = maxDepth(root.right) + 1;

        return Math.max(depthLeft, depthRight);
    }

}
