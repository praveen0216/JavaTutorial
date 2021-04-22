package tutorial.java.multithreading.mythread;

public class MyThreadJoin extends Thread {
	
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("Seetha thread");
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
		}
	}

}
