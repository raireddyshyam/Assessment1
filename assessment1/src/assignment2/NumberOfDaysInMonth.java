package assignment2;

import java.util.Scanner;

public class NumberOfDaysInMonth {
	
public static void main(String[] args) 
		{
	System.out.println("enter your choice");
	Scanner month=new Scanner(System.in);
	String Month=month.nextLine();
	switch(Month)
	{ case "Jan":System.out.println("31 days");
	              break;
	case "Feb":System.out.println("28 days");
	break;
	case "Mar":System.out.println("31 days");
	break;
	case "Apr":System.out.println("30 days");
	break;
	case "May":System.out.println("31 days");
	break;
	case "Jun":System.out.println("30 days");
	break;
	case "Jul":System.out.println("31 days");
	break;
	case "Aug":System.out.println("31 days");
	break;
	case "Sep":System.out.println("30 days");
	break;
	case "Oct":System.out.println("31 days");
	break;
	case "Nov":System.out.println("30 days");
	break;
	case "Dec":System.out.println("31 days");
	break;
	default:System.out.println("Invalid choice");
	break;
	}

		}

	}

