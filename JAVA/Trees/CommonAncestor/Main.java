package Trees.CommonAncestor;

import Trees.TreeNode;

public class Main {

    public static void main(String[] args) {
        FirstCommonAncestor fca  = new FirstCommonAncestor();
        TreeNode            root = new TreeNode(4);
        root.left           = new TreeNode(5);
        root.right          = new TreeNode(7);
        root.left.left      = new TreeNode(1);
        root.left.right     = new TreeNode(3);
        root.left.left.left = new TreeNode(8);

        System.out.println(fca.firstCommonAncestor(root, root.left.left.left, root.right).value);
        System.out.println(fca.firstCommonAncestor(root, root.left.left, root.left.right).value);
        System.out.println(fca.firstCommonAncestor(root, root, root.right));
    }

}
