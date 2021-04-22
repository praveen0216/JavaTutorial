package tutorial.java.multithreading.mythread;

public class MyThreadYield extends Thread {
	
	@Override
	public void run() {
		
		for(int i=0;i<100;i++) {
			System.out.println("child-Thread");
			Thread.yield();
		}
	}

}
