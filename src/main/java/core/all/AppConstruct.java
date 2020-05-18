package core.all;

public class AppConstruct {
	static Integer a=0;//��� ������� �� ��� ������
	AppConstruct(Integer age, String b){
		age=a++;//�� ��� ����� 
		System.out.println("������� ������ "+age+" ��� "+"���="+b);
	}
	AppConstruct(Integer ages, String b,Double f){
		ages=++a;//�� ��� �����
		System.out.println("������� ������ "+ages+"��� "+"���="+b+" �/�= "+f);
	}
	public static void main(String[] args) {
		new AppConstructChild(1);
		new AppConstructChild(2);
		new AppConstructChild(3);
		new AppConstructChild(4);
	}
}
class AppConstructChild extends AppConstruct{
	AppConstructChild(Integer g){
		super(g,"�����");
		new AppConstruct(g,"�����",31.2);
		System.out.println("���������� "+g+" ��� ");
	}}
	





