package com.tnsf.demolambda;

interface shape
{
	void draw();
}

public class Demo2lambda 

{

	public static void main(String[] args) 
	{
        shape circle=()->System.out.println("this is a draw method");
        circle.draw();
	}

}
