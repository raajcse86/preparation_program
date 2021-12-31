package com.codility;

public class QueueUsingArray {
    int front=-1,rear=-1;
    int capacity=5;
    int currentSize=0;
    int[] a = new int[capacity];

    void enqueue(int item){
        if(currentSize == capacity){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        a[rear] =item;
        currentSize++;
    }

    int poll(){
        if(currentSize== 0){
            System.out.println("Queue is empty nothing to poll");
            return 0;
        }
        front++;
        return a[front];
    }




    public static void main(String[] args) {
        QueueUsingArray queueUsingArray = new QueueUsingArray();
        queueUsingArray.enqueue(10);
        queueUsingArray.enqueue(20);
        queueUsingArray.enqueue(30);
        //System.out.println(queueUsingArray.poll());

        queueUsingArray.enqueue(40);
        queueUsingArray.enqueue(50);
        queueUsingArray.enqueue(60);

        //System.out.println(queueUsingArray.poll());


        //System.out.println(queueUsingArray.poll());

    }
}
