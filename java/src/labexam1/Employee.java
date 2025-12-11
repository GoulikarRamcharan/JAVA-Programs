package labexam1;
import java.util.*;
public class Employee {
protected int id;
protected String name;
protected int salary;
protected String deptname;
protected String organization;

public Employee(int id, String name, int salary, String deptname, String organization){
	this.id = id;
	this.name = name;	 
	this.salary = salary;
	this.deptname = deptname;
	this.organization = organization;
}
public int getid() {
	return id;
}
public String getname() {
	return name;
}
public int getSalary() {
	return salary;
}
public String getdeptname() {
	return deptname;
}
public String getorganization() {
	return organization;

	}
@Override
public String toString() {
	return "Id"+id+" name: "+name+" Salary: "+salary+" deptname: "+deptname+" organization:"+organization;
}
}