package org.system;

public class Desktop1 implements Hardware,Software {
	
	public void comp()
	{
		System.out.println("software");
	}
	
public static void main(String[] args) {
		
		Desktop1 desk=new Desktop1();
		desk.hardwareResources(12);
		desk.softwareResources(43);
}

public void softwareResources(int number) {
	// TODO Auto-generated method stub
	
}

public void hardwareResources(int number) {
	// TODO Auto-generated method stub
	
}
}