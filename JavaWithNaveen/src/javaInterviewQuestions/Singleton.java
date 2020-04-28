package javaInterviewQuestions;

public class Singleton {
	
	// In OOP, the Singleton class is a class that can have only one object(Instance of the class) at time
	
	// How to craete Singleton class:
	
	// 1. make constructor private
	
	// 2.create a static method that has a return type of the object of this singleton class ( Lazy Initialization)
	
	private static Singleton singleton_instance = null; // created an instance variable of this class which is pointing to null
	
	public String str = "";                             // create a regular variable
	
	private Singleton() {
		str = "Hey, I'm using Singleton class here !"; 
	}
		public static Singleton getInstance() {
			if(singleton_instance == null)            // lazy Initialization
			   singleton_instance = new Singleton();
			   
			   return singleton_instance;
			
		
		
	}
	
	
	public static void main(String[] args) {
		
	Singleton x	= Singleton.getInstance();
	Singleton y	= Singleton.getInstance();
	Singleton z	= Singleton.getInstance();
	
	x.str = (x.str).toUpperCase();
	
	System.out.println(x.str);
	System.out.println(y.str);
	System.out.println(z.str);
	
	z.str = (z.str).toLowerCase();
	
	System.out.println(x.str);
	System.out.println(y.str);
	System.out.println(z.str);
	}

}
