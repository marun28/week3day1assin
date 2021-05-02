package org.system;

public class College1 extends University{
	
	 public void ug() {
		System.out.println("override pg");
	}
	
	public static void main(String[] args)
	{
		College1 coll = new College1();
		coll.pg();
		coll.ug();
	}
}