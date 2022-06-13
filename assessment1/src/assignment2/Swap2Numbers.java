package assignment2;

import java.util.Scanner;

public class Swap2Numbers {

public static void main(String[] args)
        {
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter the numbers ");
			int a=obj.nextInt();
			int b=obj.nextInt();
			System.out.println("Before Swapping:\n a="+a+"\n b="+b);
		int temp;
		temp=a;
	     a=b;
		b=temp;
		System.out.println("After Swapping:\n a="+a+"\n b="+b);
		}
}
