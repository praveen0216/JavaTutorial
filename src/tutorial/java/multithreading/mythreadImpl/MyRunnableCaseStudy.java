package tutorial.java.multithreading.mythreadImpl;

import tutorial.java.multithreading.mythread.MyRunnable;

public class MyRunnableCaseStudy  {

public static void main(String[] args) {
		
		MyRunnable r= new MyRunnable();
		Thread t1= new Thread("t1-child-thread");
		Thread t2= new Thread(r,"t2-child-thread");
		
		//Case-1
		//t1.start();
		
		//Case-2
		//t1.run();
		
		//Case-3
		//t2.start();
		
		//Case-4
		//t2.run();
		
		//Case-5
		//r.start(); //will get compile time error as below
		
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * The method start() is undefined for the type MyRunnable
		 * 
		 * at tutorial.java.multithreading.mythreadImpl.MyRunnableCaseStudy.main(
		 * MyRunnableCaseStudy.java:26)
		 */
		
		//Case-6
		r.run();
		
		for(int i=0;i<100;i++) {
			
			System.out.println("main-thread ; executed by-> "+Thread.currentThread().getName());
		}

	}

}