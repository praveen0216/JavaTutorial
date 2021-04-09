package tutorial.java.multithreading.mythread;

public class MyThreadOverridingStartMethod extends Thread {
	
	public void start() {
		super.start();//twist
		System.out.println("start method");
	}
	
	public void run() {
		System.out.println("run method");
	}

}
