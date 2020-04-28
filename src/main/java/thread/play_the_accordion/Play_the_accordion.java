package thread.play_the_accordion;

public class Play_the_accordion {

	 public static void main(String[] args) throws InterruptedException {		 
		 Runnable threadCoordinator = new ThreadCoordinator();
         Thread threadCor= new Thread(threadCoordinator);
         threadCor.start();
       threadCor.join(); 
         System.out.println("_EnD_");
	    }
}
