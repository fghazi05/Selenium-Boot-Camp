package assignment_1;

public class ElementFromArray {
	
	public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5,6,7,8,9,10};   // we have an array of integers stored in variable' num'
        int toFind = 7;                           // the number to be found is stored in 'toFind'
        boolean found = false;

        for (int n : num) {                       //we use a for each loop to iterate through all elements of num
            if (n == toFind) {                    //check individually if toFind is equal to n or not.
                found = true;
                break;                            //If yes, we set found to true and break from the loop. If not, we move to the next iteration
            }
        }

        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }

}
