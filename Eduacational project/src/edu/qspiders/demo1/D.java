package edu.qspiders.demo1;

public class D implements int1,int2

{
	@Override
	public void odd() 
	{
		int a=7;
		if (a%2!=0) 
		{
		System.out.println("it is an odd no "+a);
		}
	}

	@Override
	public void even() 
	{
	int a=6;
		if (a%2==0) 
		{
			System.out.println("it is an even no "+a);
		}
	}
	
public static void main(String[] args)
	{
		D a1=new D();
		a1.odd();
		a1.even();
	}
}
