package core.serializable;

import java.io.Serializable;

public class Child extends Parent implements Serializable {

private static final long serialVersionUID = 4405102766026610006L;
private int age;

public Child(int age) {
System.out.println("Create Child");
System.out.println("����� ������������ ������ Child");

this.age=age;
}
public String toString() {
return super.toString()+",age="+age;
}
}