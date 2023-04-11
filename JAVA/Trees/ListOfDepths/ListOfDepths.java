package Trees.ListOfDepths;

import Trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*

Return a linked list for each level of the tree

Example
   Input:
         4
      2     7
    1   3  6  9

   Output:
     4
     2->7
     1->3->6->9

 */

public class ListOfDepths {

    public List<LinkedList<TreeNode>> listOfDepths(TreeNode root) {

        List<LinkedList<TreeNode>> result = new ArrayList<>();

        LinkedList<TreeNode> current = new LinkedList<>();

        current.add(root);

        while (!current.isEmpty()) {
            result.add(current);

            LinkedList<TreeNode> parents = current;

            current = new LinkedList<>();

            for (TreeNode node : parents) {
                if (node.left != null) {
                    current.add(node.left);
                }

                if (node.right != null) {
                    current.add(node.right);
                }
            }

        }

        return result;

    }

}
