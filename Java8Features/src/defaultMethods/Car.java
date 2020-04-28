package defaultMethods;

public class Car implements Vehicle, FourWheeler{
	

	@Override
	public void print() {
		//System.out.println("I am a Car");
		Vehicle.super.print();
	}
	public static void main(String[] args) {
		Car honda = new Car();
	    honda.print();
	    Vehicle.blowHorn();
	}
	

}
