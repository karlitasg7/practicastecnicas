package Trees.InvertBinaryTree;

import Trees.TreeNode;

public class Main {

    public static void main(String[] args) {

        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode         root             = new TreeNode(4);
        root.left        = new TreeNode(2);
        root.right       = new TreeNode(7);
        root.left.left   = new TreeNode(1);
        root.left.right  = new TreeNode(3);
        root.right.left  = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode newRoot = invertBinaryTree.invertTree(root);
        System.out.println(newRoot.value);
        System.out.println(newRoot.left.value);
        System.out.println(newRoot.right.value);
        System.out.println(newRoot.left.left.value);
        System.out.println(newRoot.left.right.value);
        System.out.println(newRoot.right.left.value);
        System.out.println(newRoot.right.right.value);

    }

}
