package defaultMethods;

public interface Vehicle {
	
	default void print() {
		System.out.println(" I am a veicle");
	}
	
	static void blowHorn() {
		System.out.println("Blowing Horn!!");
	}

}
