package Tree;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class SymmetricTree {

    // Main function
    public boolean isSymmetric(TreeNode root) {

        // Empty tree is symmetric
        if (root == null) {
            return true;
        }

        // Compare left and right subtree
        return isMirror(root.left, root.right);
    }

    // Function to check mirror
    private boolean isMirror(TreeNode left, TreeNode right) {

        // Both null
        if (left == null && right == null) {
            return true;
        }

        // One null and one not null
        if (left == null || right == null) {
            return false;
        }

        // Values should match
        if (left.val != right.val) {
            return false;
        }

        // Check mirror condition
        return isMirror(left.left, right.right)
                &&
               isMirror(left.right, right.left);
    }

    // Main method
    public static void main(String[] args) {

        SymmetricTree tree = new SymmetricTree();

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        // Check symmetric
        boolean result = tree.isSymmetric(root);

        System.out.println("Is Symmetric Tree? " + result);
    }
}