import java.util.Scanner;
public class EvenOdd2SeperateArrays
{
   public static void main(String[] args) 
   {
      int number, b = 0, c = 0;
      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter number of elements of an array: ");
      number = sc.nextInt();
      int[] arrNumber = new int[number];
      int[] oddNumber = new int[number];
      int[] evenNumber = new int[number];
      System.out.println("Please enter all the elements of an array: ");
      for(int a = 0; a < number; a++)
      {
         arrNumber[a] = sc.nextInt();
      }
      for(int a = 0; a < number; a++)
      {
         if(arrNumber[a] % 2 != 0)
         {
            oddNumber[b] = arrNumber[a];
            b++;
         }
         else
         {
            evenNumber[c] = arrNumber[a];
            c++;
         }
      }
      System.out.print("Odd elements of an array: ");
      if(b > 1)
      {
         for(int a = 0; a < (b - 1); a++)
         {
            System.out.print(oddNumber[a] + ",");
         }
         System.out.print(oddNumber[b - 1]);
      }
      else
      {
         System.out.println("number not entered");
      }
      System.out.println("");
      System.out.print("Even elements of an array: ");
      if(c > 1)
      {
         for(int a = 0; a < (c - 1); a++)
         {
            System.out.print(evenNumber[a] + ",");
         }
         System.out.print(evenNumber[c - 1]);
      }
      else
      {
         System.out.println("number not entered");
      }
      sc.close();
   }
}
