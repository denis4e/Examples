package core.proc.dyn.single_lib_2;
import core.proc.dyn.single_lib_1.Node;

public class lab4_main {
	public static void main(String[] args) throws Exception  {
		Node tail = new Node(0, new Node(1, new Node(2, new Node(3, new Node(4, null)))));
		addlast(tail,32);
		System.out.println(toString(tail)+"-�������� � �����");	
		dellast(tail);
		System.out.println(toString(tail)+"-������� � �����");	
		addPos(tail,1, 60);
		System.out.println(toString(tail)+"-�������� � �������");	
		dellPos(tail,1);
		System.out.println(toString(tail)+"-������ �������");
	}
	public static String toString(Node tail) {
	       String result = "";
	       while(tail!=null)
	       {	       	
	       	result+=tail.value+"-";
	       	tail = tail.next;
	       }
	return result+"null";
	   }	 
	 public static Node addlast(Node tail, int elem) {
		 if(tail==null){
			 return new Node(elem, null);}
	while(tail.next!=null){
		tail=tail.next;
	}
		 tail.next=new Node(elem,null);
		return tail;}	 
	 
public static Node dellast(Node tail) {
	Node head=null;
 if(tail==null){
		 return tail;}
	while(tail.next!=null){
		head = tail;
		tail=tail.next;}	
	head.next=null;		 
	return head;
	}

public static Node addPos(Node tail,int index, int elem) throws Exception{
	 Node prevNode = null;
	 Node newNode = null;
	 Node curNode = tail;
if(tail==null){
return tail;}
 if (index == 0) {
     tail = new Node(tail.value=elem, tail.next);
     } 
     if(index>0){
     for (int i = 0; i < index; i++) {
         prevNode = curNode;
         curNode = curNode.next;
     }
     newNode = new Node(elem, curNode);
     prevNode.next = newNode;}
     return newNode;
 	}

public static Node dellPos(Node tail,int index) {
	Node current = tail;
	int count = 0;
	if(tail==null){//�������� ���� ������ ����
		return tail;}
	else{
		while(current!=null){	//������� ��������� ������	
	   count++;
       current=current.next;}	
		if(index>count){//�������� ���� ������� ������� ������ ������ ������
			System.out.println("������� ������������ ������� ��� �������");
			return tail;}}
	if(index==0){//�������� ���� ������� 0 �������
		current=new Node(tail.next.value,tail.next.next);
		tail=current;
		}	
	for(count = 0;count<=index-1;count++) {  
		if(count==index-1){
		tail.next=tail.next.next;} 
		tail=tail.next;  
				         }
       return tail;
	 }}
