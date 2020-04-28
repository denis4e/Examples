package ex.mech.traces_1;

public class traces_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.err.print(0);
		try {
		System.err.println(1);
		if (true) {throw new NullPointerException();
}
		System.err.print(2);
		} catch (RuntimeException e) {
		System.err.print(3);
		if (true) {/*...*/}
		System.err.print(4);
		} finally {
		System.err.print(5);
		if (true) {/*...*/}
		System.err.print(6);
		}
		System.err.print(7);
		}

	}


