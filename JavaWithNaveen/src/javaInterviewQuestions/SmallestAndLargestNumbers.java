package javaInterviewQuestions;

// Find the Largest and smallest number in an Array

public class SmallestAndLargestNumbers {

	public static void main(String[] args) {
		
		int[] arr = {422, 56, -5, 67, -34, 33, 1};
		
		int largest = arr[0];
		int smallest = arr[0];
		
		for(int i = 1; i< arr.length; i++) {
			if(arr[i]> largest) {
			largest = arr[i];
		}
			else if(arr[i]< smallest) {
				smallest = arr[i];
			}
		

	}
		System.out.println("The largest number in array is : " + largest);
		System.out.println("The smallest number in  array is : " + smallest);

}
}