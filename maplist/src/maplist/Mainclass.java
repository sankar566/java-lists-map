package maplist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mainclass {
	
	Department department = new Department();
	
	public Map<String,List<StudentDetails>> studentdepartment(){
		List<StudentDetails>eee = department.electricalstudents();
		List<StudentDetails>ece = department.ecestudents();
		Map<String,List<StudentDetails>> mapobj = new HashMap();
		mapobj.put("electrical", eee);
		mapobj.put("electronics", ece);
		return mapobj;
	}

	public static void main(String[] args) {
		
		Mainclass mainclass = new Mainclass();
		Map <String,List<StudentDetails>> studentmap = mainclass.studentdepartment();
		Set<String>dept = studentmap.keySet();
		for(String itr : dept) {
			if (itr.equalsIgnoreCase("electrical")) {
				List<StudentDetails>eeestudent = studentmap.get(itr);
				int count = 0;
				for(StudentDetails studentdetails:eeestudent) {
					System.out.println(studentdetails.getCity());
					System.out.println(studentdetails.getDepartment());
					System.out.println(studentdetails.getName());
					System.out.println(studentdetails.getAge());
					count++;
				}
					System.out.println(count);
				}
		}
}
}