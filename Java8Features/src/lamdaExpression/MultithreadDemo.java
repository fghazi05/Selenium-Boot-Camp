package lamdaExpression;
//
//class MyRunnable implements Runnable{
//	public void run() {
//	   	for(int i=0 ; i<10 ; i++);
//		System.out.println("This is child Thread");    // Single Thread here
//	}
//}
//
//public class MultithreadDemo {
//
//	public static void main(String[] args) {
//		MyRunnable r = new MyRunnable();
//		Thread t = new Thread(r);
//		t.run();
//		
//		for(int i = 0 ; i< 10; i++){
//		System.out.println("This is main Thread"); // Now two thread are gonna run simultaneously
//}
		// If we want to convert it into Lambda expression
public class MultithreadDemo {
	public static void main(String[] args) {
		Runnable r = ()->{
			for (int i =0; i<10; i++) {
				System.out.println("This is Child Thread");    //implementing class is replaced by Lambda Expression
				 
			}
		};
			
		Thread t = new Thread(r);
		t.run();
		
		for(int i = 0 ; i< 10; i++) {
		System.out.println("This is main Thread");
		
	}
	
}	

}		
		
		

	


