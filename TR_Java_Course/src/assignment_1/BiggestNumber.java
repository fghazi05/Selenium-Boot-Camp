package assignment_1;
import java.util.Scanner;

public class BiggestNumber {
	public static void main(String[] args) {
		
	int x,y,z;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any three numbers:");
     x= sc.nextInt();
     y= sc.nextInt();
     z= sc.nextInt();
   
    if (x > y && x > z)
        System.out.println("First number is largest.");
      else if (y > x && y > z)
        System.out.println("Second number is largest.");
      else if (z > x && z > y)
        System.out.println("Third number is largest.");
      else
        System.out.println("The numbers are not distinct.");

	}
}
