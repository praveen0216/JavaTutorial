package tutorial.java.multithreading.mythreadImpl;

import tutorial.java.multithreading.mythread.MyThreadNoRunMethod;

public class MyThreadNoRunMethodDemo {

	public static void main(String[] args) {
		MyThreadNoRunMethod t= new MyThreadNoRunMethod();
		t.start();
	}

}
