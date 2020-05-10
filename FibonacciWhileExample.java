import java.util.Scanner; 
public class FibonacciWhileExample {
 
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		 int maxNumber = in.nextInt();
		 int previousNumber = 0, nextNumber = 1;
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
 
	        int i=1;
		int totalsum = 0;
	        while(i <= maxNumber)
	        {
	            System.out.print(previousNumber+" ");
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;    
	            i++;
	        }
		totalsum = totalsum + nextNumber;
		System.out.print('\n');
		System.out.print(totalsum-1);
 
	}
 
}