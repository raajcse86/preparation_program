package com.test.bst;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

public class TaskLimitSemaphore2 {
    private final ExecutorService executor;
    private final Semaphore semaphore;

    public TaskLimitSemaphore2(ExecutorService executor, int limit) {
        this.executor = executor;
        this.semaphore = new Semaphore(limit);
    }

    public <T> Future<T> submit(final Callable<T> task) throws InterruptedException {

        semaphore.acquire();
        System.out.println("semaphore.acquire()...");

        return executor.submit(() -> {
            try {
                return task.call();
            } finally {
                semaphore.release();
                System.out.println("semaphore.release()...");
            }
        });

    }

    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newCachedThreadPool();

        // Only 2 tasks are able to run concurrently
        TaskLimitSemaphore2 obj = new TaskLimitSemaphore2(executor, 2);

        obj.submit(() -> {
            System.out.println(getCurrentDateTime() + " : task1 is running!");
            Thread.sleep(2000);
            System.out.println(getCurrentDateTime() + " : task1 is done!");
            return 1;
        });

        obj.submit(() -> {
            System.out.println(getCurrentDateTime() + " : task2 is running!");
            Thread.sleep(2000);
            System.out.println(getCurrentDateTime() + " task2 is done!");
            return 2;
        });

        obj.submit(() -> {
            System.out.println(getCurrentDateTime() + " task3 is running!");
            Thread.sleep(2000);
            System.out.println(getCurrentDateTime() + " task3 is done!");
            return 3;
        });

        obj.submit(() -> {
            System.out.println(getCurrentDateTime() + " task4 is running!");
            Thread.sleep(2000);
            System.out.println(getCurrentDateTime() + " task4 is done!");
            return 4;
        });

        obj.submit(() -> {
            System.out.println(getCurrentDateTime() + " task5 is running!");
            Thread.sleep(2000);
            System.out.println(getCurrentDateTime() + " task5 is done!");
            return 5;
        });

        executor.shutdown();
    }

    private static String getCurrentDateTime() {
        return sdf.format(new Date());
    }
}
