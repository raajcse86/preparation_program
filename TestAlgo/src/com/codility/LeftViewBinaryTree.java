package com.codility;


import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }

}
public class LeftViewBinaryTree {

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(5);
        root.right = new Node(2);

        root.right.left = new Node(3);
        root.right.right = new Node(1);

        root.right.left.left = new Node(6);
        root.right.right.right = new Node(7);

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i=1;i<=n;i++){
                Node element = queue.poll();
                if(i==1){
                    System.out.println("--"+element.data);
                }

                if(element.left != null){
                    queue.add(element.left);
                }

                if(element.right != null){
                    queue.add(element.right);
                }

            }
        }







    }
}
