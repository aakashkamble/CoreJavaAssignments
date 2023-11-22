package GenericsAssignments;

import java.util.HashSet;

public class Employee {
	int id;
	String name;
	double salary;
	String department;
	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public void displayDetails() {
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee Department: "+department);
	}

public boolean equals(Object ob) {
	if(this==ob) {
		return true;
		
	}
	if(ob==null || getClass()!=ob.getClass()) {
		return false;
	}
	Employee employee=(Employee) ob;
	return id==employee.id;
}
	
public int hashCode() {
	return Integer.hashCode(id);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> hs=new HashSet<>();

		Employee e1=new Employee(1, "Akash", 300000.0, "IT");
		Employee e2=new Employee(2, "Sachin", 500000.0, "HR");
		hs.add(e1);
		hs.add(e2);
		
		for(Employee employee: hs) {
			employee.displayDetails();
		}

		
		
		
		
	}

}
