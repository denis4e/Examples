package tes1.reflection;

import java.lang.reflect.*;
//Наследник Лиственные- Плодовые
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
		            System.out.println("Имя метода: " + method.getName()); 
		            System.out.println("Возвращаемый тип метода: " + method.getReturnType().getName()); 
		            Class[] paramTypes = method.getParameterTypes();
		            for (Class paramType : paramTypes) { 
		                System.out.println("Типы параметров: " + paramType.getName()); 
		        }}
				//получение и запуск метода
		        Class[] paramTypes = new Class[] { String.class, Integer.class }; 
		        Method method = cls.getMethod("SpruceTreeStart", paramTypes);
		        Object[] args = new Object[] { new String("First Calculate-"), new Integer(10) }; 
		        Integer d = (Integer) method.invoke(obj, args); 		        
		    }
		       catch (Exception ex) {
		        System.out.println("Ошибка при поиске класса "+cls+":\n");
		        System.out.println(ex.toString()+"\n");
		    }}}
		

