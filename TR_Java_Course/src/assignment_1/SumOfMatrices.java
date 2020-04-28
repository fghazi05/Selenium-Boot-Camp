package assignment_1;

public class SumOfMatrices {
	

	
	 public static void main(String arg[])
	 {
	  int a[][]= new int[3][3];
	  int b[][] = new int[3][3];
	  int c[][]= new int[3][3];    //The 3rd matrix is the sum of first two
	  int i,j,k=0;
	  for(i=0;i<3;i++)             // i represent the no of rows while j represent the no of col
	  {
	   for(j=0;j<3;j++)
	   {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	    a[i][j]=k;
	     k++;                      //The value of k is incremented by 1 so the values in 2nd matrix will be incremented by 1
	    b[i][j]=k;
	   }
	  }
	  System.out.println("1st matrix is");
	  for(i=0;i<3;i++)
	  {
	   for(j=0;j<3;j++)
	    {
	     System.out.print("  " +a[i][j]);
	    }
	     System.out.println("\n");
	   }
	   System.out.println("2nd matrix is");
	  for(i=0;i<3;i++)
	  {
	   for(j=0;j<3;j++)
	    {
	     System.out.print("  " +b[i][j]);
	    }
	     System.out.println("\n");
	   }
	  System.out.println("Sum of two matrices is");
	 for(i=0;i<3;i++)
	  {
	   for(j=0;j<3;j++)
	   {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	    c[i][j]=a[i][j]+b[i][j];
	   }
	  }
	   for(i=0;i<3;i++)
	  {
	   for(j=0;j<3;j++)
	    {
	     System.out.print("  " +c[i][j]);
	    }
	     System.out.println("\n");
	   }
	 }
	}



