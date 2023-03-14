package ustbatchno3.sonarqubetest;

import java.util.Arrays;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empdetails e1 = new empdetails("sasi",21,2,23000);
		empdetails e2 = new empdetails("abu",22,4,25000);
		empdetails e3 = new empdetails("kodiyan",22,3,24000);
		empdetails e4 = new empdetails("jabaa",23,5,27000);
		empdetails e5 = new empdetails("poombata",21,7,28000);
		empdetails e6 = new empdetails("finla",22,8,30000);
		empdetails e7 = new empdetails("aysha",24,13,32000);
		
		List<empdetails> lst = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		List<empdetails> lss = lst.stream()
				.peek(k->{
					if((k.getYears()>=1)&&(k.getYears()<=3))
						k.setSalary(k.getSalary()+(0.025)*k.getSalary());
					else if((k.getYears()>=4)&&(k.getYears()<=6))
						k.setSalary(k.getSalary()+(0.05)*k.getSalary());
					else if((k.getYears()>=7)&&(k.getYears()<=10))
						k.setSalary(k.getSalary()+(0.1)*k.getSalary());
					else if((k.getYears()>10))
						k.setSalary(k.getSalary()+(0.12)*k.getSalary());}
				      ).toList();
				
		lss.forEach(t->System.out.println(t));
	}

}
