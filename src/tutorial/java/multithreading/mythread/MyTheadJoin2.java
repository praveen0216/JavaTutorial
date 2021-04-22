package tutorial.java.multithreading.mythread;

public class MyTheadJoin2 extends Thread{

	public static Thread mtj2;
	
	//child thread calls join method on main thread. child thread will wait until main thread completes
	
	@Override
	public void run()  {
		
		for(int i=0;i<10;i++) {
			
			try {
				mtj2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("executed by child thread");
		}
		
		
	}
}
