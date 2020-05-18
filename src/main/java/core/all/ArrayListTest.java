package core.all;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTest<T> {
    ArrayList<T> lst = new ArrayList<T>();
    Random generator = new Random();

    void addRandom() {
          lst.add((T) new Integer(generator.nextInt()));
    }
    public String toString() {
         return lst.toString();
    }

    public static void main(String args[]) {
        ArrayListTest<Integer> tst = new ArrayListTest<Integer>();
        for(int i = 0; i < 100; i++ )
               tst.addRandom();
         System.out.println("��� ��������� �����: "+tst.toString());
    }}