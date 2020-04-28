package javaInterviewQuestions;

public class fibonacciSeries {

	public static void main(String[] args) {
		
		int max = 10;
		int n1 = 0;
		int n2 = 1 ;
		int sum;
		
		for(int i= 1; i<= max; i++) {
			System.out.print(n1 +" ");
			 sum = n1 +n2;
			 n1= n2;
			 n2= sum;
		}
		

	}

}
