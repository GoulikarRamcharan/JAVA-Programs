import java.util.Scanner;
class Student{
	
	private int strollno;
	private int stage;
	private String stname;

	void setData(int r,int a,String n){
		strollno = r;
		stage = a;
		stname = n;
	}
	void getData(int r1,String s1,int a1,int r2,String s2,int a2){
		System.out.println("studen 1 rollno:"+strollno+" "+"Student 1 age"+ " "+stage+" "+stname);
		System.out.println(r1+" "+s1+" "+a1);
		System.out.println(r2+" "+s2+" "+a2);

	}
	public static void main(String[] args) {
		Student stu = new Student();
		//implementing a scanner
		Scanner sc= new Scanner(System.in);

		//student 2 name
		System.out.println("Enter Student 2 name");
		String s1 = sc.nextLine();
		//student 3 name
		System.out.println("Enter Student 3 name");
		String s2 = sc.nextLine();
		//student 2 data
		System.out.println("Enter Student 2 roll no");
		int r1 = sc.nextInt(); 
		System.out.println("Enter Student 2 age");
		int a1 = sc.nextInt();
		//student 3 data
		System.out.println("Enter Student 3 roll no");
		int r2 = sc.nextInt(); 
		System.out.println("Enter Student 3 age");
		int a2 = sc.nextInt();

		//defing the first student val using setter
		stu.setData(1,104,"vedant");
		//using the getteer to display the data
		stu.getData(r1,s1,a1,r2,s2,a2);
	}
}