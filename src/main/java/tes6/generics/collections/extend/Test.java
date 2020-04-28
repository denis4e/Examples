package tes6.generics.collections.extend;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test {
	static ArrayList<String> lists=new ArrayList<>();
	static List<String> listss= lists;
	static List<Object> listsss= new ArrayList<>();
	public static void main(String[] args) {
		
		for (int i = 0; i < 25; i++) {
			listss.add("1"+i);
		}
	 print(listss);
	 print(lists);//оба указывают на один Лист
	// print(listsss);//не правильно по ветви наследования
		
	}
	static void print(Collection<String> coll){
		for (String string : listss) {
		System.out.println(string);	
		}
		}
}
