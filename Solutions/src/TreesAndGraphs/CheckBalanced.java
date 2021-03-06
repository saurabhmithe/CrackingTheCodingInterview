package TreesAndGraphs;

public class CheckBalanced {

    /*

    Implement a function to check if a binary tree is balanced.
    For the purposes of this question, a balanced tree is defined
    to be a tree such that the heights of the two subtrees of
    any node never differ by more than one.

    */

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        int diff = leftHeight - rightHeight;
        if (Math.abs(diff) > 1) return false;
        return isBalanced(root.left) & isBalanced(root.right);
    }

    public int getHeight(TreeNode root) {
        if (root == null) return -1;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public static void main(String[] args) {
        MinimalTree minimalTree = new MinimalTree();
        TreeNode root = minimalTree.constructTree(new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
        }, 0, 12);
        CheckBalanced checkBalanced = new CheckBalanced();
        boolean isBalanced = checkBalanced.isBalanced(root);
        System.out.println(isBalanced);
    }
}
