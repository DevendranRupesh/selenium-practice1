package org.college;

public class Student extends Dept {
	
	void Student1() {
		
		System.out.println("Student Name is Rajesh");
		System.out.println("Student Dept is Mechanical Engineering");
		System.out.println("Student id is 1234");
	}

	
	public static void main(String[] args) {
		
		Student st= new Student();
		  st.Student1();
		  st.Dept1();
		  st.Hostel1();
		  st.College1();
		
		
	}
}
