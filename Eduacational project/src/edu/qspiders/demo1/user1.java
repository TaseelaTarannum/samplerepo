package edu.qspiders.demo1;

public class user1 extends Hotel implements int8
{

	@Override
	public void hungry() 
	{
		System.out.println("order food, mutton biryani from armani biryani ");
		
	}
	public static void main(String[] args) 
	{
		user1 a1=new user1();
		a1.hungry();
		a1.order();
	}
}
