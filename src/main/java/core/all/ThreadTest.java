package core.all;

public class ThreadTest implements Runnable{

	@Override
	public void run() {
		System.out.println("������ �� ����������� ������");
		
	}
	public static void main(String[] args) {
		 ThreadTest th= new  ThreadTest();
		th.run();

	}
	

}
