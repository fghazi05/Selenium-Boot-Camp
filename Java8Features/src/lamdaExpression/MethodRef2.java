package lamdaExpression;

interface interf{
	public void add(int a, int b);
}

public class MethodRef2 {
	public static void sum(int x, int y) {
		System.out.println("The sum is : "+ (x+y));
	
	}
	
	public static void main(String[] args) {
		
	//	interf i = (a,b)-> System.out.println("The sum is : "+ (a+b));
		interf i = MethodRef2:: sum;
		i.add(10, 30);
		
	}

}
// FI add() method is referring class sum() method