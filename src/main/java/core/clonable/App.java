package core.clonable;

public class App {

		public static void main(String[] args) {
			 CloneObj user = new CloneObj();
	            
             user.setName("������");
             user.setAge(25);
            
             System.out.println("������ �� ������������: " +
user.getName() + " - " + user.getAge() + "���");
            
             CloneObj clone;
             try {
                    clone = user.clone();
                    clone.setName("������");
                    clone.setAge(30);
                    System.out.println("���� ����� ��������� ������: " +
                           clone.getName() + " - " + clone.getAge() + "���");
                   
             } catch (CloneNotSupportedException e) {
                    System.out.println("������ �� ����� ���� �������������.");
             }
            
            
             System.out.println("��������, ����� ����������� � ������: " +
 user.getName() + " - " + user.getAge() + "���");
       }

	}


