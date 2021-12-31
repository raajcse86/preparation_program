package com.test.binary.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinaryTreeApp {
       Node root;

        void inOrder(Node node){
            if(node == null)
                return;

            inOrder(node.left);
            System.out.println(node.data+ " ");
            inOrder(node.right);
        }

        int getNumberOfNodes(Node node){
            if(node == null){
                return 0;
            }
            return 1+getNumberOfNodes(node.left)+getNumberOfNodes(node.right);
        }

        int getSumOfNodes(Node node){
            if(node == null){
                return 0;
            }
            return node.data + getSumOfNodes(node.left) + getSumOfNodes(node.right);
        }

        int getDifferenceAtEvenOddValues(Node node){
            if(node == null){
                return 0;
            }
            return node.data - getDifferenceAtEvenOddValues(node.left) - getDifferenceAtEvenOddValues(node.right);
        }

        int getNumberOfLeafNodes(Node node){
            if(node == null){
                return  0;
            }
            if(node.left == null && node.right == null){
                return 1;
            }
            return getNumberOfLeafNodes(node.left)+getNumberOfLeafNodes(node.right);
        }

        int getHeightOfTree(Node node){
            if(node == null){
                return -1;
            }
            return Math.max(getHeightOfTree(node.left),getHeightOfTree(node.right))+1;
        }

        void printElementsAtGivenLevel(Node node,int level){
                if(node == null){
                    return;
                }
                if(level == 1){
                    System.out.println(node.data);
                }
                printElementsAtGivenLevel(node.left,level-1);
                printElementsAtGivenLevel(node.right,level-1);
        }

        void printLevelOrderTraversalUsingQueue(Node node){
            Queue<Node> q = new LinkedList<Node>();
            if(node == null){
                return;
            }
            q.add(node);

            while(q.size() > 0){
                Node top = q.remove();
                System.out.println(top.data);
                if(top.left != null){
                    q.add(top.left);
                }

                if(top.right != null){
                    q.add(top.right);
                }

            }




        }

    void preOrder(Node node){
        if(node == null)
            return;
        System.out.println(node.data+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void postOrder(Node node){
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data+ " ");
    }

    int maxLevel;
    void leftViewOfTree(Node node,int level){
        if(node == null){
            return;
        }
        if(level >=maxLevel){
            System.out.println(node.data + " ");
            maxLevel++;
        }
        leftViewOfTree(node.left,level+1);
        leftViewOfTree(node.right,level+1);
    }




    public static void main(String[] args) {
        BinaryTreeApp binaryTreeApp = new BinaryTreeApp();
        binaryTreeApp.root = new Node(2);
        binaryTreeApp.root.left = new Node(7);
        binaryTreeApp.root.right = new Node(5);
            binaryTreeApp.root.left.left = new Node(2);
        binaryTreeApp.root.left.right = new Node(6);

        binaryTreeApp.root.left.right.left = new Node(5);
        binaryTreeApp.root.left.right.right = new Node(11);
        binaryTreeApp.root.right.right = new Node(9);
        binaryTreeApp.root.right.right.left = new Node(4);

//        System.out.println("InOrder------");
//        binaryTreeApp.inOrder(binaryTreeApp.root);
//
//        System.out.println("PreOrder------");
//        binaryTreeApp.preOrder(binaryTreeApp.root);
//
//
//        System.out.println("PostOrder------");
//        binaryTreeApp.postOrder(binaryTreeApp.root);

     //   binaryTreeApp.leftViewOfTree(binaryTreeApp.root, 0);

        binaryTreeApp.printElementsAtGivenLevel(binaryTreeApp.root, 2);




    }
}
