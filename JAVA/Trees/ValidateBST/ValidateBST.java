package Trees.ValidateBST;

import Trees.TreeNode;

/*

check if a tree is a valid binary search tree, with the next conditions:

- the left subtree only has values <=
- the right subtree only has values >

Example 1:
  Input:
         4
      5     7
    1   3
  8
 Output: false

Example 2:
  Input:
         4
      2     7
    1   3  5

  Output: true

 */
public class ValidateBST {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if ((min != null && root.value <= min) || (max != null && root.value > max)) return false;

        return isValidBST(root.left, min, root.value) && isValidBST(root.right, root.value, max);
    }

}
