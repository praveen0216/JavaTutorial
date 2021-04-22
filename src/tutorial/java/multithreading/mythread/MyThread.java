package tutorial.java.multithreading.mythread;

public class MyThread extends Thread {

	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("child Thread : executed by--> "+Thread.currentThread().getName()); 
		}
		
	}
	

}
