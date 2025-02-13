package dsa.trees.tree2;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        int[] values = {6, 7, 2, 9, 8, 4, 1, 5, 3};
        tree.buildTree(values);

        System.out.print("Inorder Traversal (Sorted BST): ");
        tree.inorderTraversal();
    }
}
