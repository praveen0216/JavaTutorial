package tutorial.java.multithreading.mythreadImpl;

import tutorial.java.multithreading.mythread.MyThreadJoin;

public class MyThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyThreadJoin mtj= new MyThreadJoin();
		mtj.start();
		//mtj.join();
		mtj.join(10000);
		for(int i=0;i<10;i++) {
			System.out.println("Rama Thread");
		}
		

	}

}
