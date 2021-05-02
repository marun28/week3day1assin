package org.system;

public class Axisbank extends Bankinfo {
	
	public void deposit()
	{
		System.out.println("deposit Ac");
	}
	
	public static void main(String[] args) {
	
	Axisbank bank=new Axisbank();
	bank.deposit();
	bank.fixed();
	
	
}}
