package tutorial.java.multithreading.mythreadImpl;

import tutorial.java.multithreading.mythread.MyThreadOverridingStartMethod;

public class MyThreadOverridingStartMethodDemo {

	public static void main(String[] args) {
		MyThreadOverridingStartMethod t= new MyThreadOverridingStartMethod();
		t.start();
		System.out.println("main Thread");
		//t.start();//java.lang.IllegalThreadStateException
	}

}
