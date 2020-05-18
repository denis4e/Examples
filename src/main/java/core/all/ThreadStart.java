package core.all;

public class ThreadStart extends Thread{

	 public void run()	//���� ����� ����� �������� � �������� ������
	    {
	        System.out.println("������ �� ��������� ������!");
	    }
	
	public static void main(String[] args) {
		
		ThreadStart t=new ThreadStart();
		t.start();
	}

}
