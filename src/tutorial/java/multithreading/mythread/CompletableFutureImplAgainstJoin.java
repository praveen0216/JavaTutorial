package tutorial.java.multithreading.mythread;


import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

public class CompletableFutureImplAgainstJoin {
    public static void main(String[] args) {
        CompletableFuture<Void> venueFixing = CompletableFuture.runAsync(
                ()-> IntStream.range(0,10).forEach(i->System.out.println("venue-fixing")));

        CompletableFuture<Void> weddingCard = CompletableFuture.runAsync(
                ()-> IntStream.range(0,10).forEach(i->System.out.println("wedding-card")));

        CompletableFuture<Void> weddingCardDistribution = CompletableFuture.runAsync(
                ()-> IntStream.range(0,10).forEach(i->System.out.println("wedding-card-distribution")));

        CompletableFuture.allOf(venueFixing, weddingCard, weddingCardDistribution).join();
    }
}
