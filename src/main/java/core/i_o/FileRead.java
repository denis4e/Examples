package core.i_o;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileRead {

	public static void main(String[] args) throws IOException {
		
			InputStream iofl=new FileInputStream("C:\\test.txt");
			System.out.println("������ ����� = "+iofl.available()+"����");//�������� ��� ������ ����
			System.out.println((char)iofl.read());
			System.out.println("������ ����� = "+iofl.available()+"����");//�������� ��� ������ ���� ����� ����������
			iofl.skip(4);//���������� 4 �������
			System.out.println((char)iofl.read());//��������� ������ 
			System.out.println("������ ����� = "+iofl.available()+"����");//�������� ��� ������ ����
			iofl.skip(2);//���������� 2 �������
			System.out.println((char)iofl.read());
			System.out.println("������ ����� = "+iofl.available()+"����");//�������� ��� ������ ����
	}

}
