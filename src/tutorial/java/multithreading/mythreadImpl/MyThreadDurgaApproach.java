package tutorial.java.multithreading.mythreadImpl;

import tutorial.java.multithreading.mythread.MyThread;

public class MyThreadDurgaApproach {

	public static void main(String[] args) {
		
		Thread t= new Thread(new MyThread(),"child-thread");
		t.start();
		
		System.out.println("main-thread ; executed by--> "+Thread.currentThread().getName());

	}

}
