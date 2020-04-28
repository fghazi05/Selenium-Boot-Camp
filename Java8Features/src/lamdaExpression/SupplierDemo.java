package lamdaExpression;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
//		Supplier<Date> s = () -> new Date();
//		System.out.println(s.get());
		
		Supplier<String> s = () ->{
			String otp= "";
			for(int i = 0; i<6; i++) {
				
				otp = otp+(int )(Math.random()*10);          //0>= x>1   min of x is0 and max of x is 0.99999 
				
			}
			return otp;
		};
		System.out.println(s.get());

	

	}
}