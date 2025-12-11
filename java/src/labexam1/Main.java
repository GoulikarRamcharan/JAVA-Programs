package labexam1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
	List<Employee> emp = new LinkedList<>();
	
	emp.add(new Employee(104,"Vedant Londhe", 50000, "Tester","Cdac"));
	emp.add(new Employee(103,"Tejas Panchal", 60000, "Developer","Cdac"));
	emp.add(new Employee(104,"Satyam", 70000, "Tester","Cdac"));
	emp.add(new Employee(105,"Ram", 50550, "project manager","Cdac"));
	emp.add(new Employee(106,"Shyam", 50000, "project manager","Cdac"));
	emp.add(new Employee(107,"Sarvesh", 60000, "Developer","Cdac"));
	emp.add(new Employee(109,"Sanjay", 70000, "Tester","Cdac"));
	emp.add(new Employee(111,"Samrudhha", 50000, "project manager","Cdac"));
	emp.add(new Employee(112,"Jatin", 60000, "Developer","Cdac"));
	System.out.println("Desplaying the employee details");
	for (Employee e:emp) {
		System.out.println(e);
	}
	 
	Collections.sort(emp, new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getname().compareTo(o2.getname());
		}
		
	});
	emp.forEach(System.out::println);
	}
}
