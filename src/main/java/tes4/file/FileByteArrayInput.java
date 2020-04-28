package tes4.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileByteArrayInput {
	 public static void main(String[] args) 
	    {
		 
	   FileInputStream fis; //объект, читающий байты из файла
       InputStreamReader isr = null; //объект, преобразующий байты в символы определенной кодировки
       BufferedReader in; //объект класса BufferedReader, принимающий символы из объекта InputStreamReader
       String s;
       //открытие файла
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
           System.out.println("Не могу открыть файл");
           return;
       }
       //чтение строк из файла и отображение на экране
       try
       {
           while((s = in.readLine()) != null)
           {
               System.out.println(s);                
           }
       }
       catch(IOException e1)
       {
           System.out.println("Ошибка чтения файла.");
       }
       //закрытие файла
       try
       {
           fis.close();
       }
       catch(IOException e2)
       {
           System.out.println("Ошибка закрытия файла.");
       } 
}}


