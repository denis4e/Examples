package core.proc.dyn.single_lib_1;

public class lab_main {
public static void main(String[] args) {
Node tail = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
System.out.println(toString(tail)); 
System.out.println("Max :"+max(tail));
System.out.println("Min :"+min(tail));
System.out.println("������ :"+ length(tail));
System.out.println("����� :"+ sum(tail));	
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
 
public static int max(Node tail) {
if(tail==null){
return 0;
}
int maxi = tail.value;
if(tail.next!=null){
int nextValue = max(tail.next);
if(nextValue > maxi) {
        maxi = nextValue ;
        }
}
return maxi;
}
public static int min(Node tail) {
if(tail==null){
return 0;
}
int mins= tail.value;
for (; tail!=null ; tail=tail.next) {
if(mins>tail.value){
 mins=tail.value;
        }	 
           }
return mins;
}	 
public static int length(Node tail) {
if(tail==null){
return 0;
}
int i = 0;
while(tail!=null){
i++;
tail=tail.next;
}	 
return i;
}

public static int sum(Node tail) {
	return (tail==null) ? 0 : tail.value+sum(tail.next);
}}

