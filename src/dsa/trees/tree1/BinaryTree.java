package dsa.trees.tree1;

class BinaryTree {
    Node root;

    BinaryTree(int value) {
        root = new Node(value);
    }

    void addLeftChild(Node parent, int value) {
        parent.left = new Node(value);
    }

    void addRightChild(Node parent, int value) {
        parent.right = new Node(value);
    }

    void displayInOrder(Node node) {
        if (node != null) {
            displayInOrder(node.left);
            System.out.print(node.value + " ");
            displayInOrder(node.right);
        }
    }

    void displayPreOrder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            displayPreOrder(node.left);
            displayPreOrder(node.right);
        }
    }

    void displayPostOrder(Node node) {
        if (node != null) {
            displayPostOrder(node.left);
            displayPostOrder(node.right);
            System.out.print(node.value + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);
        tree.addLeftChild(tree.root, 2);
        tree.addRightChild(tree.root, 3);
        tree.addLeftChild(tree.root.left, 4);
        tree.addRightChild(tree.root.left, 5);

        System.out.println("In-order traversal of the binary tree:");
        tree.displayInOrder(tree.root);
        System.out.println();

        System.out.println("Pre-order used to make a copy og the tee");
        System.out.println("Pre-order traversal of the binary tree:");
        tree.displayPreOrder(tree.root);
        System.out.println();

        System.out.println("Post-order traversal of the binary tree:");
        tree.displayPostOrder(tree.root);
        System.out.println();
    }
}
