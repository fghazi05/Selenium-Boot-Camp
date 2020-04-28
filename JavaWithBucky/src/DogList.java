
public class DogList {
	
	private Dog[] theList = new Dog[5];   // theList is an array that holds objects of Dog class
	
	private int i = 0;                    //counter variable
	
	public void add (Dog d) {             // method add holds the obj of class Dog and we call it 'd'
		
		if(i< theList.length) {           // It checks if the array is full or not. It should be less than 5
			
			theList[i] = d;               //if the array is not full then it adds the object at ith index.Evrery time we call the method it adds an obj to the array
			
			System.out.println("The Dog added to index " + i);
			
			i++;
			
			                               
		}
		  
	
		
	}

}
