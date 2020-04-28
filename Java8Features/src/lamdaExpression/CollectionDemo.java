package lamdaExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

//class MyComparator implements Comparator<Integer>{
//	public int compare(Integer I1 , Integer I2) {
//		if(I1<I2) {
//			return -1;
//		}
//		
//		else if(I1>I2) {
//			return +1;
//		}
//		
//		else
//			return 0;
//		
//	}
//
//	
//	}
//
//
//public class CollectionDemo {
//
//	public static void main(String[] args) {
//		ArrayList<Integer> I = new ArrayList<Integer>();
//		I.add(10);
//		I.add(20);
//		I.add(25);
//		I.add(5);
//		I.add(30);
//		I.add(0);
//		I.add(15);
//		
//		System.out.println(I);
//		Collections.sort(I, new MyComparator());
//		System.out.println(I);
//		
//
//	}
//
//}
// Implementing Lambda Expression

//class MyComparator implements Comparator<Integer>{
//	public int compare(Integer I1 , Integer I2) {
//		
//			return (I1<I2)?-1:(I1>I2)?1:0;
//		
//		
//	}
//
//	
//	}


public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList<Integer> I = new ArrayList<Integer>();
		I.add(10);
		I.add(20);
		I.add(25);
		I.add(5);
		I.add(30);
		I.add(0);
		I.add(15);
		
		System.out.println(I);
		Comparator<Integer> c = (I1, I2)->(I1<I2)?-1:(I1>I2)?1:0;  //n->n*n; or n-> {return n*n;};
		Collections.sort(I, c);
		System.out.println(I);
		

	}

}
