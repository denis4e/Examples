package core.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class CollectionSet {
static String name;
	@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CollectionSet other = (CollectionSet) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
	public static void main(String[] args) {
		HashSet<String> myHashSet = new HashSet<String>();
		name="�������";
		myHashSet.add(name);
		myHashSet.add("�����");
		myHashSet.add("���-�'�����");
		myHashSet.add("�������");
		myHashSet.add("��������");
		myHashSet.add("������");
		myHashSet.add("�����");
		myHashSet.add("���-�'�����"); // ��� �������� �������� ��� ��� ��� ���������
		System.out.println("*****************HashSet*****************");
		System.out.println("�� �������� ���������� � �� ���������+��������� ��� �����(�� ������ ������)");
		System.out.println(myHashSet.toString());
		
		//TreeSet
		 TreeSet<String> stringset = new TreeSet<>();
		    stringset.add("������");
		    stringset.add("�������");
		    stringset.add("��������");
		    stringset.add("���-�'�����"); // ������� ������ ���� �����
		    stringset.add("�������");
		    stringset.add("�����");
		    stringset.add("���-�'�����");
		    stringset.add("�������");
		    stringset.add("�����");
		    stringset.add("������");
		    stringset.add("�����������");
		    System.out.println("*****************TreeSet*****************");
			System.out.println("�� �������� ���������� � �������� �����������");
			System.out.println(stringset);
			
			//LinkedHashSet
			LinkedHashSet<String> sss = new LinkedHashSet<>();
			    sss.add("������");
			    sss.add("�������");
			    sss.add("��������");
			    sss.add("���-�'�����"); 
			    sss.add("�������");
			    sss.add("�����");
			    sss.add("���-�'�����");
			    sss.add("�������");
			    sss.add("�����");
			    sss.add("������");
			    sss.add("1");
			    System.out.println("*****************LinkedHashSet*****************");
				System.out.println("�� �������� ���������� � �������� �� ����������� �� ������� ���������� ��������");
				System.out.println(sss);
		    
    }
		
	}

