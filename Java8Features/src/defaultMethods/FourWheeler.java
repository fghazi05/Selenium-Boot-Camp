package defaultMethods;

public interface FourWheeler {
	
	default void print() {
		System.out.println("I am a four Wheeler");
	}

}
