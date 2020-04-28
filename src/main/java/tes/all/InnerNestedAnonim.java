package tes.all;

public class InnerNestedAnonim {
	public int val=4;
	private int var=10;
	private static int van=2;
	public class B{//внутренний класс
		void init(){
			int c=val*var;
			System.out.println(c);
		}
	}
	public static class C{//статический внутренний класс
		void set(){
			int ad=van*van;
			System.out.println(ad);
			
		}
	}
	//локальный внутренний класс-внутри метода
	public Object f(){
		class D{
			
		}
		return new D();
	}
	//безимянный внутренний класс
	public void method(){
		new B(){};//выделяем память под объект который возратиться(можно интерфейс)
	}
	

}
