package core.serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class MainTest {

	public static void main(String[] args) throws Exception {
		try {
			FileOutputStream fos=new FileOutputStream("C:\\output.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Child2 child2=new Child2(20,1);
		   	System.out.println(child2);
		    child2.changeNames();
		    System.out.println(child2);		  
		   	oos.writeObject(child2); 
		   	System.out.println("writeObject Child2");
		   	Child child=new Child(30);
		  	oos.writeObject(child);
		  	System.out.println("writeObject Child");
			System.out.println(child);
			oos.flush();
			oos.close();
			System.out.println("Read objects:");
			FileInputStream fis=new FileInputStream("C:\\output.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			ois.close();
			
			} catch (Exception e) { 
			e.printStackTrace();
			}
}
}
