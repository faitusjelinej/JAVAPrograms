import java.util.Scanner;

class Calculation 
{
   int z;
	
   public void addition(int x, int y)
   {
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }
	
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }
}



public class My_Calculation extends Calculation
 {

   public void multiplication(int x,int y) 
   {
      z = x * y;
      System.out.println("The product of the given numbers:"+z);
   }
	
   public static void main(String args[]) 
   {
	  
	  System.out.println("Enter two numbers :: ");
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
	  int b = s.nextInt();
	   
    
      My_Calculation demo = new My_Calculation();
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
   }
}