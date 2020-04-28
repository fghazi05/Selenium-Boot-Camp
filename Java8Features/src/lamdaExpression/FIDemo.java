package lamdaExpression;


//
// interface InterF {
//	public void m1();
//
//}
//
////class Demo implements InterF{
////	public void m1() {
////		System.out.println("Hello! .....FI");
////	}
////}
//
////class FIDemo{
////	public static void main(String[] args) {
////		Demo d = new Demo();
////		
////		d.m1();
////	}
////}
//
//// To convert it into Lambda Expression
// 
// class FIDemo {
//	 public static void main(String[] args) {
//		InterF i = () ->System.out.println("Hello! .....FI");
//		
//		i.m1();
//	}
// }
 
 interface InterA{
	 public void add(int a , int b);
 }

 class FIDemo{
	 public static void main(String[] args) {
		InterA ia = (a ,b)->System.out.println("The sum is  :"  + (a+b));
		
		ia.add(10,20);
		ia.add(300, 400);
	}
 }
