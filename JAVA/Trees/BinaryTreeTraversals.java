package Trees;

public class BinaryTreeTraversals {

    public static void inOrderTraversal(TreeNode treeNode) {
        if (treeNode != null) {
            inOrderTraversal(treeNode.left);
            System.out.print(treeNode.value + " ");
            inOrderTraversal(treeNode.right);
        }
    }

    public static void preOrderTraversal(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.print(treeNode.value + " ");
            preOrderTraversal(treeNode.left);
            preOrderTraversal(treeNode.right);
        }
    }

    public static void postOrderTraversal(TreeNode treeNode) {
        if (treeNode != null) {
            postOrderTraversal(treeNode.left);
            postOrderTraversal(treeNode.right);
            System.out.print(treeNode.value + " ");
        }
    }

}
