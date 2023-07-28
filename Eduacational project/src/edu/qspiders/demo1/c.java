package edu.qspiders.demo1;

public class c extends B1
{

	@Override
	public void mul() {
		System.out.println("the multiplication of the 2 no is "+(5*2));
		
	}
	public static void main(String[] args)
{
	c a1=new c();
	a1.add();
	a1.sub();
	a1.mul();
}
}
