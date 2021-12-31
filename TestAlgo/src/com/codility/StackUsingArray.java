package com.codility;

public class StackUsingArray {
    int capacity = 5;
    int[] a = new int[capacity];
    int top =-1;

    void push(int item){

        a[++top] = item;
    }

    int pop(){
        return a[top--];
    }


    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray();
        stackUsingArray.push(10);
        stackUsingArray.push(20);
        stackUsingArray.push(30);
        System.out.println("---"+stackUsingArray.pop());
        stackUsingArray.push(100);
        System.out.println("---"+stackUsingArray.pop());
        System.out.println("---"+stackUsingArray.pop());









    }
}
