package tutorial.java.multithreading.mythread;

public class MyThreadRunOverloading extends Thread {
	
	public void run() {
		System.out.println("no-arg run method");
	}

	
	public void run(int i) {
		System.out.println("int-arg run method");
	}
}
