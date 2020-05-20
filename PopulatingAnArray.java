/*An array is a collection of similar types of data. It is a container that holds data (values) of one single type. For example, you can create an array that can hold 100 values of int type. */


import java.util.Arrays;
import java.util.Scanner;

public class PopulatingAnArray 
{
   public static void main(String args[]) 
   {
      System.out.println("Enter the required size of the array :: ");
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int myArray[] = new int [size];
      System.out.println("Enter the elements of the array one by one ");
     
      for(int i = 0; i<size; i++) 
	  {
         myArray[i] = s.nextInt();
      }
     System.out.println("Contents of the array are: "+Arrays.toString(myArray));
	 
	 
	 System.out.println("Enter the number to be searched in the arrary :");
	 int searchfor = s.nextInt();
	 int x;
	 boolean foundIt = false;

        for (  x = 0; x < myArray.length; x++) 
		{
            if (myArray[x] == searchfor)
				{
                foundIt = true;
                break;
            }
        }
		
		if (foundIt) 
		{
            System.out.println("Found " + searchfor + " at index " + x);
        } else {
            System.out.println(searchfor + " not in the array");
        }
	 
   }
}