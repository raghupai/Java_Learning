package classObject;

class Student {
	private int studentId, yearOfEngg;	
	private String name;
	private float qualifyingExamMarks;
	private char residentialStatus;

	public int getStudentId(){
		return studentId;
		}

	public String getName(){
		return name;
		}

	public float getQualifyingMarks(){
		return qualifyingExamMarks;
		}

	public int getYearOfEngg(){
		return yearOfEngg;
		}

	public char getResidentialStatus(){
		return residentialStatus;
		}

	public void setYearOfEngg(int year){
		yearOfEngg=year;
		}

	public void setStudentId(int id){
		studentId=id;
		}

	public void setQualifyingExamMarks(float marks){
		qualifyingExamMarks=marks;
		}

	public void setResidentialStatus(char status){
		residentialStatus=status;	
		}

	public void setName(String name){
		this.name=name;
		}
	}