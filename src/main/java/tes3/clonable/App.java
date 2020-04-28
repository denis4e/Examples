package tes3.clonable;

public class App {

		public static void main(String[] args) {
			 CloneObj user = new CloneObj();
	            
             user.setName("Иванов");
             user.setAge(25);
            
             System.out.println("Данные до клонирования: " +
user.getName() + " - " + user.getAge() + "лет");
            
             CloneObj clone;
             try {
                    clone = user.clone();
                    clone.setName("Петров");
                    clone.setAge(30);
                    System.out.println("Клон после изменения данных: " +
                           clone.getName() + " - " + clone.getAge() + "лет");
                   
             } catch (CloneNotSupportedException e) {
                    System.out.println("Объект не может быть клонированным.");
             }
            
            
             System.out.println("Оригинал, после манипуляций с клоном: " +
 user.getName() + " - " + user.getAge() + "лет");
       }

	}


