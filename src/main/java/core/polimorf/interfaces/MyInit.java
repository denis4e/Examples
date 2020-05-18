package core.polimorf.interfaces;

public class MyInit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MusicalInstrument m = new Bayan();
		m.play();
		m= new Guitar();
		m.play();

	}

}
