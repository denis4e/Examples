package tes.all;

import java.util.HashMap;
import java.util.Map;

public class MainPerson extends Person {
	
		private String surname;
		static Map <String,Integer> map= new HashMap<>();
		public MainPerson(String name, Integer age,String surname) {
		super(name, age);
		this.surname=surname;
	}

		public static void main(String[] args) {
			Person pr= new Person("Denis",23);
			System.out.println(pr.toString());
			MainPerson mp= new MainPerson("Anna", 21, "Smirnova");
			System.out.println(mp);
			
			map.put("Àêôð",12);
			System.out.println(mp.map);
		
}

		@Override
		public String toString() {
			return "MainPerson [surname=" + surname + ", name=" + name
					+ ", age=" + age + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
		
		
		
}
