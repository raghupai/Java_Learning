package Arrays;

public class EmployeeRecord {
	// calculate average salary of the employees

	// number of employees having salary greater than average

	// number of employees having salary less than average

	double Salary [] = {23500.00, 25080.0 ,28760.0, 22340.0, 19890.0};

	public double AverageSal(){
		double avg=0.0;
		double sum=0;

		for (int i=0 ; i<Salary.length; i++) {
			sum += Salary[i];
			avg=sum/Salary.length;
		}
		System.out.println("Average Salary is : " +avg );
		return avg;
	} 

	public void SalaryCompare(double Average){
		int countless =0;
		int countgreater=0;

		for (int i=0 ; i<Salary.length; i++) {
			if (Salary[i]>Average) {
				countgreater=countgreater+1;
			}
			else {
				countless=countless+1;
			}
		}

		System.out.println("Number of employees having salary less than average : " + countless);
		System.out.println("Number of employees having salary greater than average : " + countgreater);
	} 

	public static void main(String[] args) {
		EmployeeRecord obj =new EmployeeRecord();
		double s=obj.AverageSal();
		obj.SalaryCompare(s);
	}
}
