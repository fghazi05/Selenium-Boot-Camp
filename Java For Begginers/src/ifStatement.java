
public class ifStatement {
	public static void main(String[] args) {
//		int test = 6;
//		if (test < 9) {
//			System.out.println("Yes");
//			
//		}
//		else {
//			System.out.println("this is else");
//		}
		
		int boy = 18;
		int girl = 68;
		if (boy > 10 && girl < 40) {         // both conditions have to be true
			System.out.println("You can enter");
		}
		else {
			System.out.println("you cannot enter");
		}
		if (boy< 20 || girl >32) {           // either condition can meet
			System.out.println("You can enter");
					
		}
		else {
			System.out.println("You cannot enter");
			
		}
	}

}
