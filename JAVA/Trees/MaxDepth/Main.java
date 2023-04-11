package Trees.MaxDepth;

import Trees.TreeNode;

public class Main {

    public static void main(String[] args) {

        MaximumDepth maximumDepth = new MaximumDepth();
        TreeNode     root         = new TreeNode(4);
        root.left       = new TreeNode(2);
        root.right      = new TreeNode(7);
        root.left.left  = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.println(maximumDepth.maxDepth(root));
        root.left.left.left = new TreeNode(8);
        System.out.println(maximumDepth.maxDepth(root));
    }

}
