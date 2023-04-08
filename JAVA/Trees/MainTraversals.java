package Trees;

public class MainTraversals {

    /*
     *          1
     *      2       3
     *   4     5      6
     * 7     8
     */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left  = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left  = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);

        root.left.left.left = new TreeNode(7);

        root.left.right.left = new TreeNode(8);

        System.out.print("IN-ORDER TRAVERSAL: ");
        BinaryTreeTraversals.inOrderTraversal(root);
        System.out.println();

        System.out.print("PRE-ORDER TRAVERSAL: ");
        BinaryTreeTraversals.preOrderTraversal(root);
        System.out.println();

        System.out.print("POST-ORDER TRAVERSAL: ");
        BinaryTreeTraversals.postOrderTraversal(root);
        System.out.println();
    }

}
