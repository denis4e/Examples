package core.i_o;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileByteArrayInput {
	 public static void main(String[] args) 
	    {
		 
	   FileInputStream fis; //������, �������� ����� �� �����
       InputStreamReader isr = null; //������, ������������� ����� � ������� ������������ ���������
       BufferedReader in; //������ ������ BufferedReader, ����������� ������� �� ������� InputStreamReader
       String s;
       //�������� �����
       try
       {
           fis = new FileInputStream("c:\\pc.txt");
           try {
			isr = new InputStreamReader(fis, "WINDOWS-1251");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           in = new BufferedReader(isr);
       }
       catch(FileNotFoundException e)
       {
           System.out.println("�� ���� ������� ����");
           return;
       }
       //������ ����� �� ����� � ����������� �� ������
       try
       {
           while((s = in.readLine()) != null)
           {
               System.out.println(s);                
           }
       }
       catch(IOException e1)
       {
           System.out.println("������ ������ �����.");
       }
       //�������� �����
       try
       {
           fis.close();
       }
       catch(IOException e2)
       {
           System.out.println("������ �������� �����.");
       } 
}}


