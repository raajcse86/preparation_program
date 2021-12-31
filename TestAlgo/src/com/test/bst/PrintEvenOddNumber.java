package com.test.bst;

class SharedPrinter{
    boolean evenFlag = false;
    SharedPrinter(boolean flag){
        this.evenFlag = flag;
    }

    void printEvenNumber(int num) throws InterruptedException {
        synchronized (this) {
            while (!evenFlag) {
                wait();
            }
            System.out.println(num);
            evenFlag = false;
            notify();
        }
    }
    void printOddNumber(int num) throws InterruptedException {
        synchronized (this) {
            while (evenFlag) {
                wait();
            }
            System.out.println(num);
            evenFlag = true;
            notify();
        }
    }




}


public class PrintEvenOddNumber {
    public static void main(String[] args) {
        SharedPrinter s = new SharedPrinter(true);
        Runnable r = ()->{
          for(int i=0;i<10;i+=2){
              try {
                  s.printEvenNumber(i);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
        };
        Thread t1 = new Thread(r);
        t1.start();

        Runnable r2 = ()->{
            for(int i=1;i<10;i+=2){
                try {
                    s.printOddNumber(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(r2);
        t2.start();

    }

}
