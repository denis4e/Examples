package core.generics.collections.ext;

public class Phone extends Product {
String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Phone [name=");
	builder.append(name);
	builder.append("]");
	return builder.toString();
}
	

}
