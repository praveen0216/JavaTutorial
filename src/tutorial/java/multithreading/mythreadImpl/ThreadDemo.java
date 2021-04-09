package tutorial.java.multithreading.mythreadImpl;

import tutorial.java.multithreading.mythread.MyThread;

public class ThreadDemo {

	public static void main(String[] args) {
	
		MyThread t= new MyThread();
		t.start();// new thread is created by main thread. start() is present in Thread class which internally calls run() method.
		//t.run();// no new thread is created. run() is executed by main thread as a normal method
		for(int i=0;i<100;i++) {
			System.out.println("main Thread"); 
		}
		

	}

}
