package core.all;

public class ThreadRun {

	public static void main(String[] args) {
		Thread th=new Thread(new Runnable() {
			
			@Override
			public void run() {

System.out.println("����...");
				
			}
		});
		th.start();

	}

}
