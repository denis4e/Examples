package core.exceptions.mech.traces_2;

public class Multicath {

	public static void main(String[] args) throws Throwable{
		System.err.print(0+"-");
		try {
		System.err.print(1+"-");
		if (true) {throw new RuntimeException();}
		System.err.print(2+"-");
		} catch (NullPointerException e) {
		System.err.print(3+"-");
		if (true) {}
		System.err.print(4+"-");
		} catch (RuntimeException e) {
		System.err.print(5+"-");
		if (true) {throw new RuntimeException();}
		System.err.print(6+"-");
		} catch (Exception e) {
		System.err.print(7+"-");
		if (true) {/**/}
		System.err.print(8+"-");
		} finally {
		System.err.print(9+"-");
		if (true) {}
		System.err.print(10+"-");
		}
		System.err.print(11);

	}

}
