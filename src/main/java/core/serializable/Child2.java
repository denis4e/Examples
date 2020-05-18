package core.serializable;

public class Child2 extends Child {

	private static final long serialVersionUID = -5570136266058990343L;
private int size;

public Child2(int age, int size) {
super(age);
System.out.println("Create Child2");
this.size=size;
}

public String toString() {
return super.toString()+",size="+size;
}
}