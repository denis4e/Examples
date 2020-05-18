package core.all;
import java.util.Objects;
public class Person {
	public  String name;
	public  Integer age;


public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
@Override
public int hashCode() {
    return 31 * age + Objects.hash(name);
}
@Override
public boolean equals(Object obj) {
    if (obj == null || this.getClass() != obj.getClass()) {
        return false;
    }
    Person that = (Person) obj;
     if (age != that.age) {
        return false;
    }
    return Objects.equals(this.name, that.name);
}
@Override
public String toString() {
    return "Person-|name=" + name +  ", age=" + age + '|';
}}
