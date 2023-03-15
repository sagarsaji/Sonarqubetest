package ustb;

public class Empdetails {
	private String empname;
	private int age;
	private int years;
	private double salary;
	public Empdetails(String empname, int age, int years, double salary) {
		super();
		this.empname = empname;
		this.age = age;
		this.years = years;
		this.salary = salary;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "empdetails [empname=" + empname + ", age=" + age + ", years=" + years + ", salary=" + salary + "]";
		
	}
	
	
}
