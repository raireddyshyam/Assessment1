package assignment2;

import java.util.Scanner;

public class SmallestOfThree {

public static void main(String[] args) {
			System.out.println("Enter the three numbers:");
			Scanner small=new Scanner(System.in);
			int a=small.nextInt();
			int b=small.nextInt();
			int c=small.nextInt();
			if(a<b && a<c)
			{
				System.out.println(a+" is small");
			}
		else if (b<a && b<c)
			{
				System.out.println(b+" is small");
				
			}
			else
				System.out.println(c+" is small");
		}


}
