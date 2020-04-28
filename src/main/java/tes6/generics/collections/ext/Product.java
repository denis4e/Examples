package tes6.generics.collections.ext;

public class Product {
private String name;



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Product [name=");
	builder.append(name);
	builder.append("]");
	return builder.toString();
}


}
