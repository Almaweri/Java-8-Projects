package RandomExamples;

public class EmplyeeInfo {

	public String name;
	private double salary;
	
	
	public EmplyeeInfo(String empName) {
		name = empName;
	}
	
	public void setSalary(double empSalary) {
		salary = empSalary;
	}
	
	public void printInfo () {
		System.out.println("Name " + name);
		System.out.println("Salary" + salary);
	}
	
	
	public static void main(String[] args) {
		EmplyeeInfo newEmp = new EmplyeeInfo("Maged ");
		newEmp.salary = 2000.3;
		newEmp.printInfo();
	}
}
