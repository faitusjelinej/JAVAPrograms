/*Java program to reverse a string*/
import java.util.*;
class ReverseString
{
  public static void main(String args[])
  {
    String original  , reverse = "";
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a string to reverse");
    original = in.nextLine();

    int length = original.length();

    for (int i = length - 1 ; i >= 0 ; i--)
      reverse = reverse + original.charAt(i);

    	System.out.println("Reverse of the string: " + reverse);
	char first = original.charAt(0);
	char last = original.charAt(length - 1);
	System.out.println("First character of the string is: " + first);
	System.out.println("Last character of the string is: " + last);
  }
}