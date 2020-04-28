package ex.mech.InfOrNoInf;

public class lab_1 {
	public static void main(String[] args) {		
			try {
			System.out.println("It's nap time-1 \n");
			main(args);			 
			} 
			catch (StackOverflowError e) {
			System.out.println("It's nap time-2 \n");
			main(args);}}}


