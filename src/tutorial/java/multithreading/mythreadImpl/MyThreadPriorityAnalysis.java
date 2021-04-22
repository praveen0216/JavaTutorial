package tutorial.java.multithreading.mythreadImpl;

import tutorial.java.multithreading.mythread.MyThread;

public class MyThreadPriorityAnalysis {

	public static void main(String[] args) {
		
		System.out.println("main thread name : "+Thread.currentThread().getName() +" and main thread priority : "+Thread.currentThread().getPriority());
		MyThread t1= new MyThread();
		System.out.println("child thread-t1 priority "+t1.getPriority());
		
		Thread.currentThread().setPriority(8);
		MyThread t2= new MyThread();
		System.out.println("main thread priority :"+Thread.currentThread().getPriority());
		System.out.println("child thread-t2 priority "+t2.getPriority());
		System.out.println("child thread-t1 priority "+t1.getPriority());
		
		//Thread.currentThread().setPriority(17);
		MyThread t3= new MyThread();
		t3.setPriority(10);
		t3.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("main Thread : executed by--> "+Thread.currentThread().getName()); 
		}
		
		
		
	}

}
