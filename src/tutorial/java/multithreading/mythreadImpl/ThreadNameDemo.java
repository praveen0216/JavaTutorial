package tutorial.java.multithreading.mythreadImpl;

import tutorial.java.multithreading.mythread.MyThread;

public class ThreadNameDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		MyThread t=new MyThread();
		System.out.println(t.getName());
		
		Thread.currentThread().setName("Praveen's main");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
	

	}

}
