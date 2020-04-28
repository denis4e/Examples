package file.i_o;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileRead {

	public static void main(String[] args) throws IOException {
		
			InputStream iofl=new FileInputStream("C:\\test.txt");
			System.out.println("размер файла = "+iofl.available()+"байт");//доступно для чтения байт
			System.out.println((char)iofl.read());
			System.out.println("размер файла = "+iofl.available()+"байт");//доступно для чтения байт после считывания
			iofl.skip(4);//пропускаем 4 символа
			System.out.println((char)iofl.read());//считываем символ 
			System.out.println("размер файла = "+iofl.available()+"байт");//доступно для чтения байт
			iofl.skip(2);//пропускаем 2 символа
			System.out.println((char)iofl.read());
			System.out.println("размер файла = "+iofl.available()+"байт");//доступно для чтения байт
	}

}
