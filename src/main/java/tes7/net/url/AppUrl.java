package tes7.net.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class AppUrl {

	public static void main(String[] args) {
     try {
			URL adr=new URL("http://yandex.ru");
			InputStreamReader io = new InputStreamReader(adr.openStream());
			BufferedReader br = new BufferedReader(io);
			String line = "";
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}}
		


