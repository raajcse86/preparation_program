package com.test.bst;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST{

    Node insert(Node node, int data){
        if(node == null){
            return createNewNode(data);
        }else{
            if (data < node.data){
                node.left = insert(node.left,data);
            }else if(data > node.data){
                node.right = insert(node.right,data);
            }
        }
        return node;
    }

    public void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.data+"");
        inOrder(node.right);


    }

    private Node createNewNode(int data) {
        Node node = new Node(data);
        return node;
    }
}

public class BSTApp {

    public static void main(String[] args) {
        //8,3,6,10,4,7,1,14,13
        // 8
        //3     //10
        //1 //6     //14
            //4 //7 //13

        BST bst = new BST();
        Node root = null;
        root = bst.insert(root,8);

        bst.insert(root,3);

        bst.insert(root,6);

        bst.insert(root,10);

        bst.insert(root,4);

        bst.insert(root,7);

        bst.insert(root,1);

        bst.insert(root,14);

        bst.insert(root,13);

        bst.inOrder(root);
    }
}
