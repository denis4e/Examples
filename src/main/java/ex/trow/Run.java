package ex.trow;

import java.io.IOException;


public class Run{
	public static void cool1() throws SecurityException  {
		TestEx t=new TestEx();	
		try {
			t.cool1();
			t.cool2();
		} catch (RuntimeException e) {
			
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		cool1();
	}
}
