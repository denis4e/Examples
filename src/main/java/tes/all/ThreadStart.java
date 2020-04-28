package tes.all;

public class ThreadStart extends Thread{

	 public void run()	//Этот метод будет выполнен в побочном потоке
	    {
	        System.out.println("Привет из побочного потока!");
	    }
	
	public static void main(String[] args) {
		
		ThreadStart t=new ThreadStart();
		t.start();
	}

}
