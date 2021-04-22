package tutorial.java.multithreading.mythreadImpl;

import tutorial.java.multithreading.mythread.MyTheadJoin2;

public class MyThreadJoin2Demo {

	//child thread calls join method on main thread. child thread will wait until main thread completes
	
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setName("main-prav-thread");
		MyTheadJoin2.mtj2=Thread.currentThread();
		
		MyTheadJoin2 mtj=new MyTheadJoin2();
		mtj.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("executed by main-Thread : "+Thread.currentThread().getName());
			Thread.sleep(2000);
			
		}
		
	
		
		

	}

}
