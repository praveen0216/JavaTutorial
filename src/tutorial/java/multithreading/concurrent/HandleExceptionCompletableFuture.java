package tutorial.java.multithreading.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HandleExceptionCompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> opertaion = CompletableFuture.supplyAsync(() -> (10/0))
                .exceptionally(e -> 0);

        System.out.println(opertaion.get());

    }
}
