package tes6.generics.collections.ext;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Container con =new Container();
		Product p=new Product();
		p.setName("denis");
		con.addProduct(p);
		Phone ph=new Phone();
		ph.setName("Nokia");
		con.addProduct(ph);
		con.print();

	}

}
