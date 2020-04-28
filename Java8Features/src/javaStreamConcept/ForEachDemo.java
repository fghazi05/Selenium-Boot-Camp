package javaStreamConcept;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		
		    ArrayList<Integer> l = new ArrayList<Integer>();
				
				l.add(0);
				l.add(20);
				l.add(15);
				l.add(10);
				l.add(5);
				System.out.println(l);
				//to process each and every element of list we use forEach()
				l.stream().forEach(System.out::println); // method ref

				//The biggest advantage of forEach() is , we can pass any function in it
				
				Consumer<Integer> c = i->{
					System.out.println("The square of " +i+ " is: " + (i*i));
				};
				l.stream().forEach(c);
				
				//or we can directly put the function in forEach() 
				
				l.stream().forEach( i->{
					System.out.println("The square of " +i+ " is: " + (i*i));
				});
	}

}
