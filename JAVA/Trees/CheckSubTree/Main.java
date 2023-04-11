package Trees.CheckSubTree;

import Trees.TreeNode;

public class Main {

    public static void main(String[] args) {
        IsSubTree isSubTree = new IsSubTree();
        TreeNode  first     = new TreeNode(4);
        first.left           = new TreeNode(5);
        first.right          = new TreeNode(7);
        first.left.left      = new TreeNode(1);
        first.left.right     = new TreeNode(3);
        first.left.left.left = new TreeNode(8);

        TreeNode second = new TreeNode(5);
        second.left      = new TreeNode(1);
        second.right     = new TreeNode(3);
        second.left.left = new TreeNode(8);
        System.out.println(isSubTree.isSubtree(first, second));

        second.right.right = new TreeNode(12);
        System.out.println(isSubTree.isSubtree(first, second));
    }

}
