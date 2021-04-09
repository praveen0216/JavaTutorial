package tutorial.java.multithreading.mythreadImpl;

public class AltRunnableDemo {

	public static void main(String[] args) {
	
		//using anonymous class
		Runnable r1= new Runnable() {
			@Override
			public void run() {
				
				for(int i=0;i<100;i++) {
					System.out.println("anonymous class --> child-thread");
				}
				
			}
		};
		
		//Using Lambda expression
		Runnable r2= ()->{
			for(int i=0;i<100;i++) {
				System.out.println("Lambda expression --> child-thread");
			}
		};
		new Thread(r1).start();
		new Thread(r2).start();
		for(int i=0;i<100;i++) {
			System.out.println("main-thread");
		}

	}

}
