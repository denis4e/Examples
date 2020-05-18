package core.all;

public class Anonimus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer []arr={25,65,32,15,98,2,5,4,87878,13};
      Collection col= new Collection(arr);
     Iterator iterForward= col.inerForward();
     while(iterForward.hasNext()){
    	 System.out.println(iterForward.next());
     }
     
     
     Thread th=new Thread(new Runnable() {
		@Override
		public void run() {
			for (int i = 0; i < 25; i++) {
				System.out.println("Out"+i);
			}
			
			
		}
	});
    
     try {
    	 Thread.currentThread().sleep(3000);
    	 th.start();
 		
 		System.out.println("sllep curent core.thread");
 	} catch (InterruptedException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
	}

}
