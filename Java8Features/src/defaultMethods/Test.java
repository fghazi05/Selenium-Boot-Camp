package defaultMethods;

interface Left{
	default void m1() {
		System.out.println("Left interface m1 method");
		
		
	}
}

interface Right{
	default void m1() {
		System.out.println("Right interface default method");
	}
}
public class Test implements Right,Left {
	public void m1() {
		System.out.println("Test default method");
		Left.super.m1();
		Right.super.m1();
	}
	

	public static void main(String[] args) {
		Test t  = new Test();
		t.m1();
		

	}

}
