package tes8.polimorf.inheritance;

public class Test {
	    public static void main(String[] args){
	        Parent p1 = new Parent();
	        Parent p2 = new Child1();
	        Parent p3 = new Child2();
	        p1.saySomething();
	        p2.saySomething();
	        p3.saySomething();
	        Parent p4= new One();
	        p4.moveIt();
	        One o1=new Two();
	        One o2 = new Three();
	        o1.moveIt();	        
	        o2.moveIt();
	    }
	}


