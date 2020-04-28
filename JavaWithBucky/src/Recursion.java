
public class Recursion {                     // A method that calls itself
	
	//main
	public static void main(String[] args) {
		System.out.println(fact(5));
		
	}
   
	//fact
	
	public static int fact(int n) {
		if( n<= 1)
		
		return  1;
		
		else
			
		return n * fact(n-1);
	}
}
