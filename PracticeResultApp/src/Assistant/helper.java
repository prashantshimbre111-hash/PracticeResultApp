package Assistant;

import Fields.Student;

public class helper {
	
	public void printer(Student name) {
		
		System.out.println("ID : " + name.id);
		System.out.println("First name : " + name.fname);
		System.out.println("Last name : " + name.lname);
		System.out.println("english marks : " + name.english);
		System.out.println("Maths marks : " + name.maths);
		System.out.println("Science marks : " + name.science);
	}
	

}
