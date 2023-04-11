package Trees.CommonAncestor;

import Trees.TreeNode;

/*
  Return the first common ancestor from two nodes

  Example:
   Input:
          4
       5     7
     1   3
   8

   firstCommonAncestor(1, 7) = 4
   firstCommonAncestor(1, 4) = null
   firstCommonAncestor(1, 3) = 5

 */

public class FirstCommonAncestor {

    class AncestorNode {
        boolean  nodeFound;
        TreeNode ancestor;
    }

    public TreeNode firstCommonAncestor(TreeNode root, TreeNode firstNode, TreeNode secondNode) {
        return postOrderSearch(root, firstNode, secondNode).ancestor;
    }

    private AncestorNode postOrderSearch(TreeNode root, TreeNode firstNode, TreeNode secondNode) {
        if (root == null) {
            return new AncestorNode();
        }

        AncestorNode leftResult = postOrderSearch(root.left, firstNode, secondNode);
        if (leftResult.ancestor != null) return leftResult;

        AncestorNode rightResult = postOrderSearch(root.right, firstNode, secondNode);
        if (rightResult.ancestor != null) return rightResult;

        AncestorNode result = new AncestorNode();
        if (leftResult.nodeFound && rightResult.nodeFound) {
            result.ancestor = root;
            return result;
        }

        result.nodeFound = root == firstNode || root == secondNode || leftResult.nodeFound || rightResult.nodeFound;

        return result;
    }

}
