package ustb;


import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Employee {

	private static final Logger LOGGER = Logger.getLogger(Employee.class.getName());
	public static void main(String[] args) {

		Empdetails e1 = new Empdetails("sasi", 21, 2, 23000);
		Empdetails e2 = new Empdetails("abu", 22, 4, 25000);
		Empdetails e3 = new Empdetails("kodiyan", 22, 3, 24000);
		Empdetails e4 = new Empdetails("jabaa", 23, 5, 27000);
		Empdetails e5 = new Empdetails("poombata", 21, 7, 28000);
		Empdetails e6 = new Empdetails("finla", 22, 8, 30000);
		Empdetails e7 = new Empdetails("aysha", 24, 13, 32000);

		List<Empdetails> lst = Arrays.asList(e1, e2, e3, e4, e5, e6, e7);

		for (Empdetails k : lst) {
			if ((k.getYears() >= 1) && (k.getYears() <= 3))
				k.setSalary(k.getSalary() + (0.025) * k.getSalary());
			else if ((k.getYears() >= 4) && (k.getYears() <= 6))
				k.setSalary(k.getSalary() + (0.05) * k.getSalary());
			else if ((k.getYears() >= 7) && (k.getYears() <= 10))
				k.setSalary(k.getSalary() + (0.1) * k.getSalary());
			else if ((k.getYears() > 10))
				k.setSalary(k.getSalary() + (0.12) * k.getSalary());
		}

		lst.forEach(i -> LOGGER.info("\n Name:" + i.getEmpname()+" age:"+i.getAge()+" Salary:"+i.getSalary()));
	}

}
