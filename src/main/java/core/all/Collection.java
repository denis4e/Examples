package core.all;

public class Collection {
private Object []ar;

public Collection(Object[] a) {
	super();
	this.ar = a;
}
public class Forward implements Iterator{
private int var=0;
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return var<=ar.length-1;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return ar[var++];
	}}
 public Iterator inerForward(){
	return new Forward();}
}
