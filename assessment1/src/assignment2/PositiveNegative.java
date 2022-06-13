package assignment2;

import java.util.Scanner;

public class PositiveNegative {
	
public static void main(String args[])
		{
			System.out.println("enter the number");
			Scanner num=new Scanner(System.in);
			int a=num.nextInt();
			if( a > 0)
			{
				System.out.println("Number is Positive");
			}
			else
			{
				System.out.println("Number is negative");
			}
		}
}


