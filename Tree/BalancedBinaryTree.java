package Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BalancedBinaryTree {

    // Function to check if tree is balanced
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    // Returns height if balanced
    // Returns -1 if not balanced
    private int checkHeight(TreeNode root) {

        // Base case
        if (root == null) {
            return 0;
        }

        // Check left subtree
        int left = checkHeight(root.left);

        // If left subtree already unbalanced
        if (left == -1) {
            return -1;
        }

        // Check right subtree
        int right = checkHeight(root.right);

        // If right subtree already unbalanced
        if (right == -1) {
            return -1;
        }

        // Check current node balance
        if (Math.abs(left - right) > 1) {
            return -1;
        }

        // Return height
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

        BalancedBinaryTree tree = new BalancedBinaryTree();

           TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Check balanced
        boolean result = tree.isBalanced(root);

        System.out.println("Is Balanced Tree? " + result);
    }
}