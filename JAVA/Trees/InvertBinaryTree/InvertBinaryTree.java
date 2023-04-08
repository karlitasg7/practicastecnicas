package Trees.InvertBinaryTree;

import Trees.TreeNode;

/*

Given a binary tree, return the inverted tree

Example
Input:
         4
      2     7
    1   3  6  9


 Output:
         4
      7     2
    9   6  3  1

 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;

        TreeNode tmp = root.left;
        root.left  = invertTree(root.right);
        root.right = invertTree(tmp);

        return root;

    }

}
