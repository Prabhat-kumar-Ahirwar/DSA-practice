package Tree;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class BST {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        // Edge case
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();

        // Add root node
        q.offer(root);

        // BFS Traversal
        while (!q.isEmpty()) {

            int size = q.size();

            List<Integer> level = new ArrayList<>();

            // Traverse one level
            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                level.add(node.val);

                // Add left child
                if (node.left != null) {
                    q.offer(node.left);
                }

                // Add right child
                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            ans.add(level);
        }

        return ans;
    }

    // Main Method
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BST obj = new BST();

        List<List<Integer>> result = obj.levelOrder(root);

        System.out.println(result);
    }
}