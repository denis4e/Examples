package thread.play_the_accordion;

public class ThreadCoordinator implements Runnable  {
	@Override
	public void run() {
		  for (int k = 0; k < 10; k++) {
	            // A + B + C
	            Runnable printerA = new PrintRunnable("A____", 90);
	            Thread threadA = new Thread(printerA);
	            threadA.start();
	            Runnable printerB = new PrintRunnable("____B", 95);
	            Thread threadB = new Thread(printerB);
	            threadB.start();
	            Runnable printerC = new PrintRunnable("__C__", 100);
	            Thread threadC = new Thread(printerC);
	            try {
	            	threadA.join();
	 	            threadB.join();
	 	            threadC.start();
					threadC.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	            }		
	}

}
