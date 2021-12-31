package com.test.executor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Executor executor = Executors.newCachedThreadPool();

        Runnable r1 = ()->{
            System.out.println("Task 1");
        };

        Runnable r2 =()-> System.out.println("Task2");

        //executor.execute(r1);


        Callable<Integer> callable1 = ()->{
           Thread.sleep(2000);
            return 2;
        };
        Callable<Integer> callable2 = ()->{
            Thread.sleep(7000);
            return 1;
        };

        List<Callable<Integer>> list = new ArrayList<>();
        list.add(callable1);
        list.add(callable2);



        ExecutorService executorService = Executors.newFixedThreadPool(5);
        //List<Future<Integer>> futures = executorService.invokeAll(list);

//        futures.forEach(future->{
//            try {
//                System.out.println("----"+future.get());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//        });


        //ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        ///Future<Integer> integerFuture = service.schedule(callable1,1,TimeUnit.MILLISECONDS);
       // System.out.println("--"+integerFuture.get());

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        scheduledExecutorService.scheduleAtFixedRate(r1,1,3000,TimeUnit.MILLISECONDS);


    }
}
