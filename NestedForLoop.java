

package Nextedloop;

import java.util.Scanner;

public class NestedForLoop 
{
	
	private static Scanner sc;

	public static void main(String[] args) 
	{
	
		int i, j;
		sc = new Scanner(System.in);
		
		System.out.println("Please enter the number to display the multiplication table");
		int no = sc.nextInt();
		
		for (i=no; i <= no; i++)
		{
			for (j=1; j <= 10; j++)
			{
				System.out.format("%d  * %d = %d\n", i,j,i*j);

			}
			System.out.println();
		}
	}
}
