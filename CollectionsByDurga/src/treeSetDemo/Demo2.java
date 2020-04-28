package treeSetDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		
//		t.add(10);
//		t.add(0);
//		t.add(15);
//		t.add(5);
//		t.add(20);
//		t.add(20);
		 t.add("Faiza");
		 t.add("Kiran");
		 t.add("Dua Sadek");
		 t.add("Sarah Khan");
		 t.add("Zainab");
		 t.add("Mariam");
		System.out.println(t);
		
		

	}

}
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2) {
		
//		Integer I1 = (Integer)obj1;
//		Integer I2 = (Integer)obj2;
//		
//		if(I1<I2)
//			return +1;
//		else if(I1>I2)
//			return -1;
//		else return 0;
		String s1 = (String)obj1;
		String s2 = obj2.toString();
		return -s1.compareTo(s2);
	}
}