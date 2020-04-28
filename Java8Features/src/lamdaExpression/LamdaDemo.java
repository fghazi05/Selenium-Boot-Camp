package lamdaExpression;

interface A{
	
	void show(int i);
}

//class XYZ implements A{            // The purpose of this class is only to implement the methods in interface and that's it. 
//	                                 // There's is no other purpose ,so we can remove this class
//	public void show() {
//		System.out.println("Hello" + i);
//	}
//	
//}


public class LamdaDemo {
	public static void main(String[] args) {
		
		A obj;
		
//		obj = new A() {
//			                                         //We are defining the method show inside this obj A. Its called Anonymous Inner class
//			                                         //Since its anonymous, in class file folder its shown as LamdaDemo$1.class
//			public void show(int i) {                // Whenever we have a method inside a block we call it a class.{};
//				System.out.println("Hello!"  + i);   // Since we know after obj the other side should be new A ,so no need to write it. 
//			}                                        // Also when we declare a method all we need are method name, parameters and return type.
//		};                                           // all these things ar already there in interface so we can remove that as well
		 
		obj =  i ->System.out.println("Hello!" + i);     // This the way of implementing interface and the advantage of this is , we do not have any
		obj.show( 6);                                          // inner class in class folder 
	}
	

}
