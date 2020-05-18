package core.mas;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayAndFile {
	
	static FileOutputStream fout; 
	
	public static void ChtenieFaila() throws FileNotFoundException
	{	
	Scanner fin = new Scanner("file2.txt");
		
		byte i;
		Deque <Byte> deq = new LinkedList<Byte>();
		while (fin.hasNextInt()) {
			i = fin.nextByte();
			if (i<0) {
				deq.addFirst(i);
				} else {deq.addLast(i);}
					}
		fin.close();
		System.out.println(deq); }
		
		
		/*int i;
		Deque <Integer> deq = new LinkedList<Integer>();
		while (fin.hasNextInt()) {
			i = fin.nextInt();
			if (i<0) {
				deq.addFirst(i);
				} else {deq.addLast(i);}
					}
		System.out.println(deq);
		}*/
		
		
	public static void main(String[] args) throws IOException 
    {
System.out.println("������� 1 - �����;\n0 - ��� ������");     	 
Scanner ifb = new Scanner(System.in);
int bufif = ifb.nextInt();
while(bufif!=0)
{	
	System.out.println("1-���� ������� �������\n"+
						"2-������ ������� �������\n"+
						"3-���� � ����� ��������� �������, (���� ������ ������� ������ 9, �� �������� ��������)\n"+
						"4-���������� ������� � ��������� �����������\n"+
						"5-����� �� ���������");
	Scanner sc = new Scanner(System.in);
	int bufint = sc.nextInt();
	switch (bufint) { 
	case 1:
		System.out.println("������� ������ �������!\n������� ������������ ��������!");
		IOStream.ReadInt();
	break;
	
	
	case 2:
		System.out.println("� ������� -"+IOStream.bufint +" ���������\n");
	break;
	
	
	case 3:
		System.out.println( "���������� �������" );
		int razm = IOStream.bufint;
		int[] mass = new int [razm];
		
		if (razm<10) {
			System.out.print("������� �������� ��������� �������");
			Scanner sc2 = new Scanner(System.in);
			for (int i=0;i<mass.length;i++)
				mass[i] = sc2.nextInt();
		}
		else
		  for (int i=0;i<mass.length;i++)
		        mass[i] = (int) ( Math.random() * razm); 	 
		System.out.print("��� ������: "); 
		for (int i: mass)
			System.out.print(i + " " ); 
			 System.out.println(""); 
		
			 //int [] mass2 = mass;
			 
			 System.out.print("���������� �������.....\n");
			 for (int i = 0; i < mass.length - 1; i++) {
	            	for (int j = mass.length - 1; j > i; j--) {
	            	 if (mass[j] < mass[j - 1]) {
	                     int temp = mass[j];
	                     mass[j] = mass[j - 1];
	                     mass[j - 1] = temp;
	                }}}
			 System.out.print("������ ����� ����������: ");
         	for (int i1: mass)
     			System.out.print(i1 + " " ); 
     			System.out.println(""); 
			
	//	������ ������� � ����
		
			 try {
				
		    fout = new FileOutputStream ("file2.txt"); 
			DataOutputStream dfo = new DataOutputStream(fout);
			//�������������� ������� ��� � ������
				for (int i = 0; i < mass.length; i++) {
     			Integer sys=mass[i];
     			dfo.writeChars(Integer.toString(sys));
				}
				dfo.close();
		
		}
		catch (NullPointerException npe) {
			System.out.println("�� ��� �� NullPointerException ��������: "+npe);
		}
	break;
	
	
	case 4:
		ChtenieFaila();
	break;
	
	
	default :
		System.out.println( "�����... " );
		bufif =0;
	break;
	}} 
System.out.println( "��� ���" );
//TODO: �������� ���������� ��������� �����
    }}
