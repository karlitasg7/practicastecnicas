package Trees.CheckSubTree;

import Trees.TreeNode;

/*
check if a second tree is subtree of the first

Example 1:
   Input:
     first:
          4
       5     7
     1   3
   8

     second:
          4
       2     7
     1   3  5

   Output: false


Example 2:
   Input:
     first:
          4
       5     7
     1   3
   8

     second:
          5
       1     3
     8

  Output: true
 */
public class IsSubTree {

    public boolean isSubtree(TreeNode first, TreeNode second) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        preOrder(first, sb1);
        preOrder(second, sb2);

        return sb1.toString().contains(sb2.toString());

    }

    public static void preOrder(TreeNode treeNode, StringBuilder sb) {
        if (treeNode == null) {
            sb.append("X");
            return;
        }
        sb.append(treeNode.value);
        preOrder(treeNode.left, sb);
        preOrder(treeNode.right, sb);
    }

}
