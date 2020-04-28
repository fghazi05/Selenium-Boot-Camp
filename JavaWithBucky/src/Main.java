
public class Main {
	
	public static void main(String[] args) {
//		 Animallist  ALO = new Animallist();
//		  Dog d  = new Dog();
//		  Fish f= new Fish();
//		  
//		  ALO.add(d);                 // We are calling the add method from DogList and passing the Dog obj as a parameter
//		  ALO.add(f); 
		
		Animal[] theList = new Animal[2];
		 Dog d  = new Dog();
		  Fish f= new Fish();
		  
		  theList[0] = d;
		  theList[1] = f;
		  for(Animal x : theList) {     //Enhanced for loop that loop through an array.'x' is a counting variable in for loop
			  x.makeNoise();            // 'x' is like an obj of array theList.,makeNoise means, d.makeNoise and f.makeNoise
		  }
				
				
	}
	 
	
	
	
	 

}
