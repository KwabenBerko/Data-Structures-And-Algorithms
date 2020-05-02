package binarytree;

public class Runner {

    public static void main(String[] args) {
        BinarySearchTreeNode root = null;
        BinarySearchTree bst = new BinarySearchTree();
        root = bst.insert(root, 15);
        root = bst.insert(root, 10);
        root = bst.insert(root, 20);
        root = bst.insert(root, 25);
        root = bst.insert(root, 8);
        root = bst.insert(root, 12);
        root = bst.insert(root, 13);
        root = bst.insert(root, 11);
        root = bst.insert(root, 14);



        System.out.println(bst.isBinarySearchTree(root));

    }

}
