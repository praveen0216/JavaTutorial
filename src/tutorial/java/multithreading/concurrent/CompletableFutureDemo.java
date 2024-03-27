package tutorial.java.multithreading.concurrent;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("Thread name inside main method " + Thread.currentThread().getName());

        CompletableFuture<String> result = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread name inside CompletableFuture " + Thread.currentThread().getName());
            return "Hello from CompletableFuture" ;
        });

        System.out.println(result.get());
    }
}
