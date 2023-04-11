package Trees.ListOfDepths;

import Trees.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ListOfDepths listOfDepths = new ListOfDepths();
        TreeNode     root         = new TreeNode(4);
        root.left        = new TreeNode(2);
        root.right       = new TreeNode(7);
        root.left.left   = new TreeNode(1);
        root.left.right  = new TreeNode(3);
        root.right.left  = new TreeNode(6);
        root.right.right = new TreeNode(9);

        List<LinkedList<TreeNode>> result = listOfDepths.listOfDepths(root);

        System.out.println(result.get(0).get(0).value);
        System.out.println(result.get(1).get(0).value);
        System.out.println(result.get(1).get(1).value);
        System.out.println(result.get(2).get(0).value);
        System.out.println(result.get(2).get(1).value);
        System.out.println(result.get(2).get(2).value);
        System.out.println(result.get(2).get(3).value);
    }

}
