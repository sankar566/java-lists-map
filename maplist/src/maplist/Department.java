package maplist;

import java.util.ArrayList;
import java.util.List;

public class Department {

	public List<StudentDetails>electricalstudents(){
		List<StudentDetails>eeelist = new ArrayList();
		StudentDetails studentdetails = new StudentDetails();
		studentdetails.setAge(18);
		studentdetails.setName("ram");
		studentdetails.setCity("vadalur");
		studentdetails.setDepartment("eee");
		eeelist.add(studentdetails);
		
		studentdetails = new StudentDetails();
		studentdetails.setAge(18);
		studentdetails.setName("vicky");
		studentdetails.setCity("chidambaram");
		studentdetails.setDepartment("eee");
		eeelist.add(studentdetails);
		
		return eeelist;
	}
	
	public List<StudentDetails>ecestudents(){
		StudentDetails studentdetails= new StudentDetails();
		List<StudentDetails>ecelist = new ArrayList();
		studentdetails.setAge(20);
		studentdetails.setCity("madurai");
		studentdetails.setName("rajaes");
		studentdetails.setDepartment("ece");
		ecelist.add(studentdetails);
		
		studentdetails= new StudentDetails();
		studentdetails.setAge(20);
		studentdetails.setCity("chennai");
		studentdetails.setName("suresh");
		studentdetails.setDepartment("ece");
		ecelist.add(studentdetails);
		return ecelist;
	}
}
