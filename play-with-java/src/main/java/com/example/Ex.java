package com.example;

import java.util.concurrent.*;

public class Ex {
    public static void main(String[] args) {

        ExecutorService executorService= Executors.newSingleThreadExecutor();
//
//        Runnable runnableTask=()->{
//            System.out.println("some task, will not return any value to current thread");
//        };
//
//        executorService.submit(runnableTask);

        Callable<String> readFileTask=()->{
            // file reading code..
            TimeUnit.SECONDS.sleep(3);
            String fileData="time up, let close session";
            return  fileData;
        };

       Future<String> future= executorService.submit(readFileTask);

        String fileData= null;
        try {
            fileData = future.get();
            System.out.println(fileData);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
