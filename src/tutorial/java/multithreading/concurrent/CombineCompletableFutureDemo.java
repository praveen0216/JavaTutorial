package tutorial.java.multithreading.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CombineCompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> first = CompletableFuture.supplyAsync(() -> "hello");
        CompletableFuture<String> second = CompletableFuture.supplyAsync(() -> "Friends");

        CompletableFuture<String> combine = first.thenCombine(second, (x,y) -> x + " -> " + y);
        System.out.println(combine.get());

    }
}
