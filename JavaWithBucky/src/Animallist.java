
public class Animallist {
	
private Animal[] theList = new Animal[5];   // theList is an array that holds objects of Animal class as well as child classes as they are also of type Animal 
	
	private int i = 0;                    //counter variable
	
	public void add (Animal a) {             // method add holds the obj of class Animal and we call it 'a'
		
		if(i< theList.length) {           // It checks if the array is full or not. It should be less than 5
			
			theList[i] = a;               //if the array is not full then it adds the object at ith index.Evrery time we call the method it adds an obj to the array
			
			System.out.println("The Animal added to index " + i);
			
			i++;
			
			                               
		}
		  
	
		
	}

}
