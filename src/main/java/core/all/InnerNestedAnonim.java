package core.all;

public class InnerNestedAnonim {
	public int val=4;
	private int var=10;
	private static int van=2;
	public class B{//���������� �����
		void init(){
			int c=val*var;
			System.out.println(c);
		}
	}
	public static class C{//����������� ���������� �����
		void set(){
			int ad=van*van;
			System.out.println(ad);
			
		}
	}
	//��������� ���������� �����-������ ������
	public Object f(){
		class D{
			
		}
		return new D();
	}
	//���������� ���������� �����
	public void method(){
		new B(){};//�������� ������ ��� ������ ������� �����������(����� ���������)
	}
	

}
