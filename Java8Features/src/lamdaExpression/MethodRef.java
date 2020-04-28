package lamdaExpression;

public class MethodRef {
	
	public static void m1() {
		for(int i =0 ;i<10 ; i++) {
			System.out.println("Child Thread");
		}
	}
	
	public static void main(String[] args) {   // instead of Writing the lambda expression separately, we can use the reference 
//		Runnable r = ()->{                     // of already existing method m1()
//			for(int i=0; i<10;i++) {
//				System.out.println("Child Thread");
//			}
//		};
	    
	    Runnable r = MethodRef:: m1;          // Wherever Runnable Functional Interface implementation is required, we can refer this 
		Thread t = new Thread(r);             // method m1().Here the run() method is referred to m1() method. m1() will be executed in place of
		t.start();                            // run() method
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}

}
