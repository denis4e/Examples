package file.i_o;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileByteWrite {

	public static void main(String[] args) throws Exception {
	byte []buffer=getinput();
	OutputStream out= new FileOutputStream("C:\\test.txt");
	out.write(buffer);
	out.close();

	}
static	byte[] getinput() throws Exception{
	byte b[]=new byte[10];
	for(int i=0; i<10;i++){
		b[i]=(byte) System.in.read();
	}
	return b;}

}
