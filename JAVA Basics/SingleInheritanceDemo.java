package chapter1;

public class SingleInheritanceDemo {

	public static void main(String[] str) {
		
		Department dept = new Department();
		
		System.out.println(dept.college_name);
		
		System.out.println(dept.department_name);
		
		dept.showCollegeName();
		
		dept.showDepartment();
		
		CollegeInfo.calc();
		
		Department.calc();
		
		dept.showCollege();
		
		java.util.List<Integer> lst = new java.util.ArrayList();
		
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(5);
		
		System.out.println(lst.contains(2));
		
		int[] x = {10,20,30,40};
		
		for(int i=0; i<x.length; i++) {
			
			if(x[i]==30) {
				
				System.out.println(true);
			}
		}
	}
}

//class SingleInheritanceDemo end

class CollegeInfo {

	String college_name = "NEC";
	
	public CollegeInfo() {
		
		System.out.println("Class - CollegeInfo");
	}
	
	public void showCollegeName() {
		
		System.out.println("College Name : " + college_name);
	}
	
	public static void calc() {
		
		System.out.println(100+200);
	}
	
	public void showCollege() {
		
		System.out.println("Total Departments : 14");
	}
}

//class CollegeInfo end

class Department extends CollegeInfo {
	
	String department_name = "CSE";
	
	public Department() {
		
		System.out.println("Class - Department");
	}
	
	public void showDepartment() {
		
		System.out.println("Department Name : " + department_name);
	}
	
	public void showCollege() {
		
		System.out.println("Total Departments : 15");
	}
}

//class Department end








