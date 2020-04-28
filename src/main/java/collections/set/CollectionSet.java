package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;


public class CollectionSet {
static String name;
	@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CollectionSet other = (CollectionSet) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
	public static void main(String[] args) {
		HashSet<String> myHashSet = new HashSet<String>();
		name="Украина";
		myHashSet.add(name);
		myHashSet.add("Алжир");
		myHashSet.add("Кот-Д'Ивуар");
		myHashSet.add("Франция");
		myHashSet.add("Гондурас");
		myHashSet.add("Нарния");
		myHashSet.add("Дания");
		myHashSet.add("Кот-Д'Ивуар"); // кот попросил добавить ещё раз для надёжности
		System.out.println("*****************HashSet*****************");
		System.out.println("не содержит дубликатов и не сортирует+добавляет как хочет(на первый взгляд)");
		System.out.println(myHashSet.toString());
		
		//TreeSet
		 TreeSet<String> stringset = new TreeSet<>();
		    stringset.add("Россия");
		    stringset.add("Франция");
		    stringset.add("Гондурас");
		    stringset.add("Кот-Д'Ивуар"); // любимая страна всех котов
		    stringset.add("Украина");
		    stringset.add("Алжир");
		    stringset.add("Кот-Д'Ивуар");
		    stringset.add("Франция");
		    stringset.add("Дания");
		    stringset.add("Нарния");
		    stringset.add("Америкосово");
		    System.out.println("*****************TreeSet*****************");
			System.out.println("не содержит дубликатов и значения сортируются");
			System.out.println(stringset);
			
			//LinkedHashSet
			LinkedHashSet<String> sss = new LinkedHashSet<>();
			    sss.add("Россия");
			    sss.add("Франция");
			    sss.add("Гондурас");
			    sss.add("Кот-Д'Ивуар"); 
			    sss.add("Украина");
			    sss.add("Алжир");
			    sss.add("Кот-Д'Ивуар");
			    sss.add("Франция");
			    sss.add("Дания");
			    sss.add("Нарния");
			    sss.add("1");
			    System.out.println("*****************LinkedHashSet*****************");
				System.out.println("не содержит дубликатов и значения не сортируются но порядок добавления сохранен");
				System.out.println(sss);
		    
    }
		
	}

