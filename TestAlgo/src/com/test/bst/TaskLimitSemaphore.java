package com.test.bst;

import java.util.concurrent.*;

class TaskSemaphore{
    ExecutorService executorService;
    Semaphore semaphore;

    TaskSemaphore(ExecutorService executorService, int limit){
        this.executorService = executorService;
        this.semaphore = new Semaphore(limit);
    }

    Future<Integer> submit(Callable<Integer> task){
       try{
           semaphore.acquire();
           System.out.println("Semaphore acquired...");
           return executorService.submit(()-> task.call());
       } catch (InterruptedException e) {
           e.printStackTrace();
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           semaphore.release();
           System.out.println("Semaphore released......");
       }
        return null;
    }

}

public class TaskLimitSemaphore {
    public TaskLimitSemaphore(ExecutorService executor, int i) {
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        TaskSemaphore t = new TaskSemaphore(executorService,2);
        t.submit(()->{
            System.out.println("Task1 submitted");
            Thread.sleep(2000);
            System.out.println("Task 1 done");
           return 1;
        });

        t.submit(()->{
            System.out.println("Task2 submitted");
            Thread.sleep(2000);
            System.out.println("Task 2 done");
            return 2;
        });

        t.submit(()->{
            System.out.println("Task3 submitted");
            Thread.sleep(2000);
            System.out.println("Task 3 done");
            return 3;
        });

        t.submit(()->{
            System.out.println("Task4 submitted");
            Thread.sleep(2000);
            System.out.println("Task 4 done");
            return 4;
        });
    }

}
