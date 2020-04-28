package lile.MyMas;

import java.util.Scanner;

public class AppMas {
    public static int razmer;
   public static String[] massstring;
   public static Integer[] massint;
    
    public static void main(String[] args) 
    {
   System.out.println("Введите размер массива:\n");
   Scanner sc1 = new Scanner(System.in);
   int razmer = sc1.nextInt();
	System.out.println("Нажмите 1 для работы с массивом");     	 
	System.out.println("Нажмите 0 для выхода из программы");   	 
	Scanner ifb = new Scanner(System.in);
	int bufif = ifb.nextInt();
	while(bufif>0){	
	System.out.println("1-Печать размера массива:");
	System.out.println("2-Внесение Элементов в массив:");
	System.out.println("3-Печать элементов масива:");
	System.out.println("4-Сортировка массива методом 'пузырька' только int");
	System.out.println("5-Выход из программы");
	Scanner sc = new Scanner(System.in);
	int bufint = sc.nextInt();
	switch (bufint) 
	{ 
	case 1:{
		System.out.println("В массиве -"+razmer +" элементов\n");
	break;
	}
	case 2:{
	System.out.println( "1-Int или 2-String:\n" ); 
	Scanner scan2 = new Scanner(System.in);
	int case1 = scan2.nextInt();
	switch (case1){
	case 1:{
		if(razmer>10)
		{
			AppMas.massint=new Integer [razmer];
			 for (int i=0;i<AppMas.massint.length;i++)
                 massint[i] = (int) ( Math.random()*3);
		}
		if(razmer<10){		
		System.out.println("Введите элементы массива (int):\n");
		AppMas.massint=new Integer [razmer];
		for (int i=0;i<AppMas.massint.length;i++){
		System.out.println("Введите "+ i+" й элемент");
		AppMas.massint[i] = IOStream.ReadInt();}
		}
	break;}
	case 2:{
		System.out.println("Введите элементы массива (string):\n");
		AppMas.massstring=new String [razmer];
		for (int i=0;i<AppMas.massstring.length;i++){
		System.out.println("Введите "+ i+" й элемент");
		AppMas.massstring[i] = IOStream.ReadString();}
		break;

	}
	default :{
		System.out.println( "Возврат в меню... " );	
	}
	}
	break;}
	case 3:
		System.out.println( "1-Int или 2-String:\n" ); 
		Scanner scan3 = new Scanner(System.in);
		int case2 = scan3.nextInt();
		switch (case2){
		case 1:{
			System.out.println( "Содержимое массива:\n" ); 
			for (Integer i: AppMas.massint)
			System.out.print( i + " " ); 
			System.out.println();
				
					break;}
		case 2:{
			System.out.println( "Содержимое массива:\n" ); 
			for (String i: AppMas.massstring)
				 System.out.print( i + " " ); 
			System.out.println();
			break;}
		default :{
			System.out.println( "Возврат в меню... " );	
		}
		
		
	break;}
		break;
	case 4:
	//	System.out.println( "Сортируем содержимое массива" );
		//Puzurek(AppCase.massint);
		//System.out.println();
	break;
	default :{System.out.println( "Выход... " );
	bufint++;}
    }//switch
	}//while
    }//main


	static void Puzurek(Integer[] mass11) {
	    System.out.println("******************");
	    System.out.println("Медот пузырьковой сортировки");
	    int f = 1;
	    vuvod(mass11);
	    long startTime = System.nanoTime();
	    while (f < 2) {                           //sortirovka
	        f = 2;
	        for (int i = 0; i < mass11.length - 1; i++) {
	        	for (int j = mass11.length - 1; j > i; j--) {
	        	 if (mass11[j] < mass11[j - 1]) {
	                 int temp = mass11[j];
	                 mass11[j] = mass11[j - 1];
	                 mass11[j - 1] = temp;
	            }}}}
	    long estimatedTime = System.nanoTime() - startTime;
	    System.out.println();
	    vuvod(mass11);
	    System.out.println();
	    System.out.println("Время сортировки: " + estimatedTime);
	    System.out.println("******************");
	        
	    }
	    static void vuvod(Integer[] mass11) {
	        for (int i = 0; i < mass11.length; i++) {
	            System.out.print(mass11[i] + " ");
	        }
	    }

}