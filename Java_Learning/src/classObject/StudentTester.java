package classObject;

public class StudentTester{

	public static void main(String args[]){
		Student s1 = new Student();
		Student s2 = new Student();

		s1.setYearOfEngg(3);
		s1.setStudentId(1001);
		s1.setQualifyingExamMarks(80);
		s1.setResidentialStatus('H');
		s1.setName("Jacob");

		char status1 =s1.getResidentialStatus();

		System.out.println("\nStudent Name\t\t: "+ s1.getName() + "\nStudent ID\t\t: "+ s1.getStudentId() + "\nQualifying marks\t: "+ s1.getQualifyingMarks() + "\nYear of Engineering\t: "+ s1.getYearOfEngg());

		if (status1=='D') 
			System.out.println("Residential status\t: Day Scholar"); 

		if (status1=='H') 
			System.out.println("Residential status\t: Hostellers" );

		
	

		s2.setYearOfEngg(2);
		s2.setStudentId(1002);
		s2.setQualifyingExamMarks(83);
		s2.setResidentialStatus('D');
		s2.setName("Peter");

		char status2 =s2.getResidentialStatus();

		System.out.println("\nStudent Name\t\t: "+ s2.getName() + "\nStudent ID\t\t: "+ s2.getStudentId() + "\nQualifying marks\t: "+ s2.getQualifyingMarks() + "\nYear of Engineering\t: "+ s2.getYearOfEngg());

		if (status2=='D') 
			System.out.println("Residential status\t: Day Scholar"); 

		if (status2=='H') 
			System.out.println("Residential status\t: Hostellers" );

		}
	}