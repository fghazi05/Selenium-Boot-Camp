import java.util.Scanner;
public class apples {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	tuna obj = new tuna();
	
//	System.out.println("Enter your name here :");
//	String name = input.nextLine();
//	
//	obj.simpleMessage(name);
//	
	System.out.println("Enter your first gf name here :");
	String temp = input.nextLine();
	
	obj.setName(temp);
	obj.saying();
	

		
	}

}
