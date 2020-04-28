package javaInterviewQuestions;

//Write a program to reverse an Array

public class ReverseArray {

	public static void main(String[] args) {
		int [] a = {10,20,30,40,50,60};
		
		//for(int i= a.length-1; i>= 0; i--) {
		//	System.out.println(a[i]);
		//}
		
		//This algorithm iterate over array and swap elements until you reach the midpoint.
        for(int i=0; i<a.length/2; i++){
			int temp = a[i]; 
			a[i] = a[a.length -i -1]; 
			a[a.length -i -1] = temp; 
		}
		for(int i= 0; i<a.length;i++) {
		System.out.print(a[i]+ " ");
		}
		
	}

}
