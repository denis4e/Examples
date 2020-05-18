package core.collections.set;
public class Sets {
public static void main(String[] args) { 
	            System.out.println("-- ������� � ��������� Set�--");
	            SetsSamples samples = new SetsSamples(10);
	            samples.print();
	            System.out.println("-- �������� HashSet --");
	            samples.clear();
	            samples.print();
	            System.out.println("-- ������� ������������ ������� � TreeSet  --");
	            samples.removeMax();
	            samples.print();
	            System.out.println("-- ������������� �� ��������� ��������� linkedHashSet � ������� �������� � ����� -element/2<25-");
	            samples.iterate();
	            samples.print();
	            System.out.println("-- ������� ����� ���������  hashSet �������� �� ���������� treeSet --");
	            samples.create();
	            samples.print();
	            System.out.println("-- ��������� � hashSet ��� ��������, ������� ���� � linkedHashSet --");
	            samples.retainAll();
	            samples.print();
	            System.out.println("-- ������� ��� �������� linkedHashSet �� hashSet --");
	            samples.removeAll();
	            samples.print();}}