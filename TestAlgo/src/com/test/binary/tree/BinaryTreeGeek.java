package com.test.binary.tree;

class NodeGeek {
    int key;
    NodeGeek left, right;

    public NodeGeek(int item)
    {
        key = item;
        left = right = null;
    }
}
public class BinaryTreeGeek {
    NodeGeek root;

    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(NodeGeek node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.key + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

    void printInorder() { printInorder(root); }

    // Driver method
    public static void main(String[] args) {
        BinaryTreeGeek tree = new BinaryTreeGeek();
        tree.root = new NodeGeek(1);
        tree.root.left = new NodeGeek(2);
        tree.root.right = new NodeGeek(3);
        tree.root.left.left = new NodeGeek(4);
        tree.root.left.right = new NodeGeek(5);

        System.out.println(
                "Preorder traversal of binary tree is ");
        tree.printInorder();
    }
}
