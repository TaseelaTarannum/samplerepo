package edu.qspiders.demo1;

public class multipleinheritance implements int7
{

	@Override
	public void m1() 
	{
		System.out.println("method m1 is in interface parent-1");
		
	}

	@Override
	public void m2() 
	{
		System.out.println("method m2 is in interface parent-2");
		
	}

	@Override
	public void m3() 
	{
		System.out.println("method m3 is in interface child");
		
	}
	public static void main(String[] args)
	{
		multipleinheritance a1=new multipleinheritance();
		a1.m1();
		a1.m2();
		a1.m3();
	}
}
