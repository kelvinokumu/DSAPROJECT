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

    void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.value + " ");
            printInOrder(node.right);
        }
    }

    void printPreOrder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }

    void printPostOrder(Node node) {
        if (node != null) {
            printPostOrder(node.left);
            printPostOrder(node.right);
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
        tree.printInOrder(tree.root);
        System.out.println();

        System.out.println("Pre-order traversal of the binary tree:");
        tree.printPreOrder(tree.root);
        System.out.println();

        System.out.println("Post-order traversal of the binary tree:");
        tree.printPostOrder(tree.root);
        System.out.println();
    }
}
