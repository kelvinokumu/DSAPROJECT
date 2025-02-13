package dsa.trees.tree2;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] values = {6, 7, 2, 9, 8, 4, 1, 5, 3};
        tree.buildTree(values);

        System.out.print("Inorder Traversal (Sorted BST): ");
        tree.inorderTraversal();

        System.out.println("Used to make a copy of the Tree");
        System.out.print("Preorder Traversal (Root, Left, Right): ");
        tree.preorderTraversal();

        System.out.println("Used to remove/delete from the Tree");
        System.out.print("Postorder Traversal (Left, Right, Root): ");
        tree.postorderTraversal();
    }
}
