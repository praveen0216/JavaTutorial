package tutorial.java.multithreading.mythreadImpl;

public class MyThreadDeadlock {

	//deadlock
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main-Thread");
		Thread.currentThread().join();
	}

}
