package forEachdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoForEach {

	public static void main(String[] args) {
		
		List<Integer> num =  Arrays.asList(1,2,3,4,5,6,7,8);
		
		//iterate using for loop
		for(int i=0; i<num.size() ;i++) {
			System.out.println(num.get(i));
		}
		
		//iterate using enhance for loop
		
		for(int i : num) {
			System.out.println(i);
		}
		
		//iterate using for Each
		
		num.forEach(i-> System.out.println(i)); // Lamda ,Consumer interface
		
		

	}

}
