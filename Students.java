package org.system;



	public class Students extends Department {
		
		public void studentName()
		{
			System.out.println("ARUN");
		}
		
		public void studentDept()
		{
			System.out.println("Mech");
		}
		
		public void studentId()
		{
			System.out.println("123456");
		}

		
		public static void main(String[] args)
		{
			
			Students studentInf=new Students();
			studentInf.studentName();
			studentInf.studentDept();
			studentInf.studentId();
			studentInf.collegeCode();
			studentInf.collegeName();
			studentInf.collegeRank();
			studentInf.deptName();
		}
		}
		
		
		
		
