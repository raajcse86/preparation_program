package com.test.bst;

import java.util.concurrent.Semaphore;

class SharedPrinterSemaphore{
    Semaphore evenSemaphore = new Semaphore(0);
    Semaphore oddSemaphore = new Semaphore(1);


    void printEvenNumber(int num) throws InterruptedException {
            evenSemaphore.acquire();
            System.out.println(num);
            oddSemaphore.release();
    }
    void printOddNumber(int num) throws InterruptedException {
        oddSemaphore.acquire();
            System.out.println(num);
            evenSemaphore.release();
        }




}


public class PrintEvenOddNumberSemaphore {
    public static void main(String[] args) {
        SharedPrinterSemaphore s = new SharedPrinterSemaphore();
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
