package tutorial.java.multithreading.mythreadImpl;

import tutorial.java.multithreading.mythread.MyThreadYield;

public class MyThreadYieldDemo {

	public static void main(String[] args) {
		
		MyThreadYield mty= new MyThreadYield();
		mty.start();
		
		for(int i=0;i<100;i++) {
			System.out.println("main-Thread");
		}

	}

}
