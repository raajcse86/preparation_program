package com;

import java.util.Stack;

class Node{
    int data;
    Node next;

    Node(){

    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class SingleLinkedList{


    void insertAtLast(Node node, int data){
            if(node.next == null){
                Node newNode = new Node(data);
                node.next = newNode;
            }else{
                node = node.next;
                insertAtLast(node,data);
            }
    }

    void insertAtFront(Node head, int data){
        Node node = new Node(data);

    }

    void printLinkedList(Node node){
        while(node != null){
            System.out.println("Data -- "+node.data);
            node = node.next;
        }
    }

    void printReverse(Node node){
        Stack<Node> nodeStack = new Stack<>();
        while(node != null){
            nodeStack.push(node);
            node = node.next;
        }
        while(!nodeStack.isEmpty()){
            Node popedNode = nodeStack.pop();
            System.out.println(popedNode.data);
        }


    }

}

public class LinkedListExample {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = null;

        SingleLinkedList singleLinkedList  = new SingleLinkedList();

        singleLinkedList.insertAtLast(head,2);
        singleLinkedList.insertAtLast(head,3);
        singleLinkedList.insertAtLast(head,4);

        singleLinkedList.printLinkedList(head);

        singleLinkedList.printReverse(head);

    }
}
