package dsa.trees.tree2;

class BinarySearchTree {
    TreeNode root;

    // Insert method to maintain Binary Search Tree order
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

    // Inorder traversal (Left, Root, Right)
    void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    // Preorder traversal (Root, Left, Right)
    void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder traversal (Left, Right, Root)
    void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val + " ");
        }
    }

    // Wrapper for all Traversal methods
    void inorderTraversal() {
        inorder(root);
        System.out.println();
    }

    void preorderTraversal() {
        preorder(root);
        System.out.println();
    }

    void postorderTraversal() {
        postorder(root);
        System.out.println();
    }

}

