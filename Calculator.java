package org.system;

public class Calculator {
	
	public void add(int a,int b)
	{
		
		int c =a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b, int c)
	{
		int d =a+b+c;
		System.out.println(d);
	}
	
	public void multiply(int a,int b)
	{
		int d =a*b;
		System.out.println(d);
	}
	
	public void multiply(int a,double b )
	{
		double d =a*b;
		System.out.println(d);
	}
	
	public void subtract(int a,int b)
	{
		int d =a-b;
		System.out.println(d);
	}
	
	public void subtract(double b,double c )
	{
		double d =b-c;
		System.out.println(d);
	}
	
	public void divide (int a,int b)
	{

		int d =a/b;
		System.out.println(d);
		
	}
	
	public void divide (int c,double d )
	{

		double e =c/d;
		System.out.println(e);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal=new Calculator();
		cal.add(1, 2);
		cal.add(1, 2, 3);
		cal.multiply(2, 3);
		cal.multiply(12, 12.3);
		cal.divide(2, 4);
		cal.divide(12, 2.4);
}}
