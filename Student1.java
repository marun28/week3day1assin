package org.system;

public class Student1 {
	public void getStudentInfo(int id)
	{
		System.out.println(id);
	}
	
	public void getStudentInfo(int id,String name)
	{
		System.out.println(id + name);
	}
	
	public void getStudentInfo(String email, long ph)
	{
		System.out.println(email + ph );
	}
	
	public static void main(String[] args) {
		
		Student1 students=new Student1();
		students.getStudentInfo(123);
		students.getStudentInfo(1234,"arun");
		students.getStudentInfo("marun@email", 1242324);
}
}