package tes4.file;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class CopyToFile {
	public static void main(String[] args) throws Exception {
		URL url=new URL("http://172.16.0.10:9090/login.jsp");
		ByteArrayOutputStream buff=new ByteArrayOutputStream();
		FileOutputStream tmp=new FileOutputStream("C:/temp/test.html");
        int b;
		  try (InputStream in = url.openStream()) {
	            while((b=in.read())!=-1){
	                buff.write(b);
	            }
	            try{
	                buff.writeTo(tmp);
	            }
	            catch(IOException e){
	                //File tmp=new File("d:/temp/file0.html");
	                //tmp.delete();
	            }

	}
		  catch(IOException e){
              //File tmp=new File("d:/temp/file0.html");
              //tmp.delete();
          }

}}
