package tutorial.java.multithreading.mythreadImpl;

import tutorial.java.multithreading.mythread.MyRunnable;

public class MyRunnableDemo {

	public static void main(String[] args) {
		
		MyRunnable r= new MyRunnable();
		Thread t= new Thread(r,"child-thread");
		t.start();
		
		for(int i=0;i<100;i++) {
			
			System.out.println("main-thread ; executed by-> "+Thread.currentThread().getName());
		}

	}

}
