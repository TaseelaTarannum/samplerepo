package edu.qspiders.demo1;
import java.util.Scanner;

public class user 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice");
		int choice=sc.nextInt();
			
		switch (choice)
			{
				case 1: kitkat a1=new kitkat();
							a1.chocolate();
							break;
							
				case 2: milkybar a2=new milkybar();
							a2.chocolate();
							break;
				case 3: dairymilk a3=new dairymilk();
							a3.chocolate();
							break;
				default: System.out.println("invalid choice");
							
			}

		
	}


}