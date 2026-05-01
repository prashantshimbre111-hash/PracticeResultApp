package Main;

import java.util.Scanner;

import Assistant.helper;
import Details.StudentDetails;
import Fields.Student;

public class Test {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.err.println("please enter name : ");
		String name = sc.next();

		StudentDetails student = new StudentDetails();
		helper h = new helper();

		switch (name) {
		case "prashant": {
			Student prashant = student.prashantdetails();
			h.printer(prashant);

//			System.out.println(prashant.id);
//			System.out.println(prashant.fname); 
//			System.out.println(prashant.lname);
//			System.out.println(prashant.english);
//			System.out.println(prashant.maths);
//			System.out.println(prashant.science);
			break;
		}
		case "rohan": {
			Student rohan = student.rohandetails();
			h.printer(rohan);

//			System.out.println(rohan.id);
//			System.out.println(rohan.fname); 
//			System.out.println(rohan.lname);
//			System.out.println(rohan.english);
//			System.out.println(rohan.maths);
//			System.out.println(rohan.science);
			break;

		}
		case "manoj": {
			Student manoj = student.manojdetails();
			h.printer(manoj);
			break;
		}
		case "vijay": {
			Student vijay = student.vijaydetails();
			h.printer(vijay);
			break;
		}
		case "pratik" : {
			Student pratik = student.pratikdetails();
			h.printer(pratik);
			break;
		}
		case "priti" : {
			Student priti = student.prtitidetails();
			h.printer(priti);
			break;
		}
		default:
			System.err.println("please enter propper name.");

		}

//		  
//		  StudentDetails student = new StudentDetails(); // Student prashant =
//		  student.prashantdetails(); // System.out.println(prashant.id); //
//		  System.out.println(prashant.fname); // System.out.println(prashant.lname); //
//		  System.out.println(prashant.english); // System.out.println(prashant.maths);
//		  System.out.println(prashant.science); //
//		  

	}

}
