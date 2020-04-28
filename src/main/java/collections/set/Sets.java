package collections.set;
public class Sets {
public static void main(String[] args) { 
	            System.out.println("-- Создаем и Заполняем Setы--");
	            SetsSamples samples = new SetsSamples(10);
	            samples.print();
	            System.out.println("-- Очистили HashSet --");
	            samples.clear();
	            samples.print();
	            System.out.println("-- Удаляем максимальный элемент в TreeSet  --");
	            samples.removeMax();
	            samples.print();
	            System.out.println("-- Передвигаемся по элементам коллекции linkedHashSet и удаляем элементы в цикле -element/2<25-");
	            samples.iterate();
	            samples.print();
	            System.out.println("-- Создаем новую коллекцию  hashSet заполняя ее элементами treeSet --");
	            samples.create();
	            samples.print();
	            System.out.println("-- Оставляем в hashSet все элементы, которые есть в linkedHashSet --");
	            samples.retainAll();
	            samples.print();
	            System.out.println("-- Удаляем все элементы linkedHashSet из hashSet --");
	            samples.removeAll();
	            samples.print();}}