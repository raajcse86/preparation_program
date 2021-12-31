package com.thread.pools;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class ThreadPool{
    int threadPoolSize;
    BlockingQueue<Runnable> queue;
    WorkerThread[] workerThreads;

    ThreadPool(int threadPoolSize){
        this.threadPoolSize = threadPoolSize;
        workerThreads = new WorkerThread[threadPoolSize];
        queue = new LinkedBlockingQueue<>();
        for(int i=0;i<threadPoolSize;i++){
            workerThreads[i] = new WorkerThread();
            workerThreads[i].start();
        }
    }

    void submit(List<Runnable> tasks){
        tasks.forEach(task->{

            synchronized (queue){
                queue.add(task);
                queue.notify();
            }

        });
    }


    class WorkerThread extends Thread{
        @Override
        public void run() {
            Runnable task;
            while(true){
                synchronized (queue){
                    if(queue.isEmpty()){
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    task = queue.poll();
                }
                task.run();
            }
        }
    }
}



public class CustomThreadPoolExample {

    public static void main(String[] args) {
            ThreadPool threadPool = new ThreadPool(4);
            Runnable r1 = ()-> System.out.println("Task1");
        Runnable r2 = ()-> System.out.println("Task2");
        Runnable r3 = ()-> System.out.println("Task3");
        Runnable r4 = ()-> System.out.println("Task4");
        List<Runnable> tasks = new ArrayList<>();
        tasks.add(r1);
        tasks.add(r2);
        tasks.add(r3);
        tasks.add(r4);
        threadPool.submit(tasks);
    }
}
