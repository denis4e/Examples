package tes.all;

public class ThreadTest implements Runnable{

	@Override
	public void run() {
		System.out.println("Привет из сторонненго потока");
		
	}
	public static void main(String[] args) {
		 ThreadTest th= new  ThreadTest();
		th.run();

	}
	

}
