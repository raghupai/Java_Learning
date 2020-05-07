package Arrays;

import java.util.Scanner;

public class SubjectMarks {
	int[] marks = new int[5];

	public void setMarks() {
		Scanner myObj = new Scanner(System.in);

		for(int i=0; i<marks.length; i++) {
			System.out.println("Enter Marks");
			marks[i]=myObj.nextInt();    
		}

		myObj.close();
	}

	public void displayMarks() {
		for (int j : marks) {
			System.out.println("The marks on subject is: " + j);
		}
	}

public static void main(String[] args) {
	SubjectMarks s = new SubjectMarks();
	s.setMarks();
	s.displayMarks();
	}
}