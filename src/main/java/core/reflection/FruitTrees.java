package core.reflection;

import java.lang.reflect.*;
//��������� ����������- ��������
public class FruitTrees extends DecTrees {
	
	public FruitTrees() {
		System.out.println("FruitTrees-constructor");}
		public void FruitStart(){
			System.out.println("FruitTrees-metod");
			}
		void reflectInfo(Object obj) {
			Class cls = obj.getClass();
		    Method[] methods = cls.getMethods(); 
		    try {		       
		        for (Method method : methods) { 
		            System.out.println("��� ������: " + method.getName()); 
		            System.out.println("������������ ��� ������: " + method.getReturnType().getName()); 
		            Class[] paramTypes = method.getParameterTypes();
		            for (Class paramType : paramTypes) { 
		                System.out.println("���� ����������: " + paramType.getName()); 
		        }}
				//��������� � ������ ������
		        Class[] paramTypes = new Class[] { String.class, Integer.class }; 
		        Method method = cls.getMethod("SpruceTreeStart", paramTypes);
		        Object[] args = new Object[] { new String("First Calculate-"), new Integer(10) }; 
		        Integer d = (Integer) method.invoke(obj, args); 		        
		    }
		       catch (Exception ex) {
		        System.out.println("������ ��� ������ ������ "+cls+":\n");
		        System.out.println(ex.toString()+"\n");
		    }}}
		

