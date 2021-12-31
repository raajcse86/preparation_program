package com.test.bst;

public class FiboDPTest {

    public static void main(String[] args) {

        System.out.println("-----"+new FiboDPTest().fibo(8));
    }

    int fibo(int n){
        if (n<2)
                return n;
        return fibo(n-1)+fibo(n-2);
    }
}
