class Memmain{
	public static void main(String[] args) {
		//creating the reference of the object
		Member mer = new Member("ram",23,78937,"mamatha nagar",350000);

		Employee emp = new Employee("ram",23,78937,"mamatha nagar",350000,"commericial");

		Manager mang = new Manager("ram",23,78937,"mamatha nagar",350000,"POC");
		
		//displaying the objects

		mer.printsalary();

		emp.getedetails();

		mang.getmdetails();
	}
}