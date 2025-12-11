package collections;

public class Student {
		protected int rollno;
		protected String name;
		protected String branch;
		protected double gpa;
		protected static String university = "C-DAC";
		
		public Student(int rollno, String name, String branch, double gpa) {
			this.rollno = rollno;
			this.name = name;
			this.branch = branch;
			this.gpa = gpa;
		}
		
		public int getRollno() {
			return rollno;
		}

		public String getName() {
			return name;
		}

		public String getBranch() {
			return branch;
		}

		public double getGpa() {
			return gpa;
		}

		public static String getUniversity() {
			return university;
		}

		@Override
		public String toString() {
			return "Student details"+" "+"Rollno:"+" "+rollno+" "+"Name:"+name+" "+"Branch:"+branch+" "+"C-Gpa"+gpa+" "+"Institute"+university;
		}
		
}
