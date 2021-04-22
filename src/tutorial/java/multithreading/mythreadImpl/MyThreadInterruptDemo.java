package tutorial.java.multithreading.mythreadImpl;

import tutorial.java.multithreading.mythread.MyThreadSleep;

public class MyThreadInterruptDemo {

	public static void main(String[] args) {
		
		MyThreadSleep t= new MyThreadSleep();
		t.start();
		t.interrupt();
		System.out.println("End of main");

	}

}
