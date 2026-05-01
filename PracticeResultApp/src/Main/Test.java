package Main;

import Details.StudentDetails;
import Fields.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDetails student = new StudentDetails();
		Student prashant = student.prashantdetails();
		System.out.println(prashant.id);
		System.out.println(prashant.fname);
		System.out.println(prashant.lname);
		System.out.println(prashant.english);
		System.out.println(prashant.maths);
		System.out.println(prashant.science);
	
		

	}

}
