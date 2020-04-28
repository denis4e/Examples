package file.i_o;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Copy {

	public static void main(String[] args) throws Exception {
		URL url=new URL("http://www.google.com.ua");
		InputStream inet=url.openStream();
		ByteArrayOutputStream buff=new ByteArrayOutputStream();
		copy(inet,buff);
	byte [] rawData=buff.toByteArray();
	String html=new String(rawData,"ascii");
	System.out.print(html);
	}
//
	private static void copy(InputStream src, ByteArrayOutputStream dst) throws Exception {
		
		while(true){
			int elem=src.read();
			if(elem!=-1){
				dst.write(elem);
			}else{
				break;
			}
		}
	}

}
