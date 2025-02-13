package dsa.trees.tree2;

class BST {
    TreeNode root;

    // Insert method to maintain BST order
    TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Method to insert values from an array
    void buildTree(int[] values) {
        for (int val : values) {
            root = insert(root, val);
        }
    }

    // Inorder traversal (Left, Root, Right) - Outputs sorted values
    void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    // Wrapper method for inorder traversal
    void inorderTraversal() {
        inorder(root);
        System.out.println();
    }
}

