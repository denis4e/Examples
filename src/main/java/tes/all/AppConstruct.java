package tes.all;

public class AppConstruct {
	static Integer a=0;//без статика не так весело
	AppConstruct(Integer age, String b){
		age=a++;//до или после 
		System.out.println("Возраст предка "+age+" лет "+"Имя="+b);
	}
	AppConstruct(Integer ages, String b,Double f){
		ages=++a;//до или после
		System.out.println("Возраст предка "+ages+"лет "+"Имя="+b+" З/П= "+f);
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
		super(g,"Шухер");
		new AppConstruct(g,"Мухер",31.2);
		System.out.println("Наследнику "+g+" лет ");
	}}
	





