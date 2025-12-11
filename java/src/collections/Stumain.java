package collections;

import java.util.*;

public class Stumain {

	public static void main(String[] args) {
		List<Student> stu = new ArrayList<>();
		
		stu.add(new Student(10,"Ramcharan","MCA",8.5));
		stu.add(new Student(11,"Vedant","EEE",8.41));
		stu.add(new Student(12,"RajGupat","CSE",7.6));
		stu.add(new Student(13,"Zafir","CSE",6.2));
		stu.add(new Student(15,"Satyam","BCA",7.8));
		stu.add(new Student(14,"Tejas","BM",9.2));
		stu.add(new Student(16,"Akhil","MCA",7.82));
		stu.add(new Student(19,"Ashish","ECE",6.32));
		stu.add(new Student(17,"Pranav","EEE",7.93));
		stu.add(new Student(18,"Prem","BM",6.1));
		stu.add(new Student(20,"Ritika","CSE",8.92));
		stu.add(new Student(21,"Gauri","MCA",9.96));
		
		//printing the student name 
		System.out.println("--displaying the student name--");
		for(Student s:stu) {
			System.out.println(s);
		}
		//printing the reverse of the list
		List<Student> reverse= new ArrayList<>();
				System.out.println("--Printing the reverse order--");
				for(int i = stu.size() - 1;i >=0 ;i--) {
					reverse.add(stu.get(i));
		}
		reverse.forEach(System.out::println);
				
		//printing the student in range of roll no
		System.out.println("--the students between the range is");
		
		for(Student s:stu) {
			if(s.getRollno() > 10) {
				if(s.getRollno() <19) {
					System.out.println(s);
				}
			}
		}
		
		//sorting by roll no Ascending 
		System.out.println("--sorting names by roll no--");
		Collections.sort(stu,new Comparator<Student>() {

			@Override
			public int compare(Student r1, Student r2) {
				return Integer.compare(r1.getRollno(), r2.getRollno());
			}
		});
		stu.forEach(System.out::println);
		
		//sorting the student name according to the ascending order using the comparator
		System.out.println("--sorting the student list according to ascending order--");
		Collections.sort(stu,new MyComp());
		
		for(Student s: stu) {
			System.out.println(s);
		}
		
		//using anynymoyus inner class sorting in descending order
		System.out.println("--printing the student list in decscending order--");
		Collections.sort(stu ,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o2.getName().compareTo(o1.getName());
			}
		});
		
		for(Student s:stu) {
			System.out.println(s);
		}
		
		//sorting the students according to cgpa ascending and decending 
		System.out.println("--printing the student list according to cgpa--");
		Collections.sort(stu, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return Double.compare(s1.getGpa(), s2.getGpa());
			}
			
		});
		
		for(Student s:stu) {
			System.out.println(s);
		}
		System.out.println("--in descending order--");
		Collections.sort(stu, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return Double.compare(s2.getGpa(), s1.getGpa());
			}
			
		});
		for(Student s:stu) {
			System.out.println(s);
		}
		//printing top n students
		System.out.println("--printing top 5 students--");
		for(int i = 0;i <5 && i <= stu.size();i++) {
			System.out.println(stu.get(i));
		}
		
		//printing the bottom n students
		System.out.println("--Printing the Bottom 5 Students--");
		for(int i = stu.size() - 5;i <stu.size();i++) {
			System.out.println(stu.get(i));
		}

		//printing the sum of all student and average
		System.out.println("--Calculating the sum and average of the students--");
		double sum = 0;
		int scount = 0;
		
		for(Student s:stu) {
				sum = sum + s.getGpa();
				scount++;
		}
		System.out.println("the sum of all students is :"+" "+sum);
		System.out.println("the average of all students is:"+" "+(sum/scount));
		
		//finding the highest cgpa and lowest cgpa
		System.out.println("--evalutaing the highest and lowest cgpa");
		double high = 0;
		double low = Double.MAX_VALUE;
		
		for(Student s:stu) {
			if(s.getGpa() > high) {
				high = s.getGpa();
			}
		}
		System.out.println("the highest cgpa is:"+high);
		
		for(Student s:stu) {
			if(s.getGpa() < low) {
				low =s.getGpa();
			}
		}
		System.out.println("the lowest cgpa is:"+low);
	
		//getting the student who had qualified the threasdhold
		System.out.println("--The students who qualified is--");
		for(Student s:stu) {
			if(s.getGpa() > 7.0) {
				System.out.println(s);
			}
		}
		
		//printing the even and odd roll no
		System.out.println("printing the even and odd roll no students");
		List<Student> evenroll= new ArrayList<>();
		List<Student> oddroll= new ArrayList<>();
		
		for(Student s:stu) {
			if(s.getRollno() % 2 == 0) {
				evenroll.add(s);
			}
			else {
				oddroll.add(s);
			}
		}
		System.out.println("--Even roll no students are--");
		evenroll.forEach(System.out::println);
		System.out.println("--ODD roll no students are--");
		oddroll.forEach(System.out::println);
		
		//Shuffleing the list
		System.out.println("The shuffled list is");
		Collections.shuffle(stu);
		for(Student s:stu) {
			System.out.println(s);
		}
		
		//removing student from list
		System.out.println("--Removing the student--");
		Iterator<Student> itr= stu.iterator();
		
		while(itr.hasNext()) {
			Student s = itr.next();
			if(s.getRollno() == 14) {
				System.out.println("The Student who is Expelled is:"+" "+s+" "+"Due to Misbehaviour");
				itr.remove();
			}
		}
		System.out.println("--After removing the list--");
		for(Student s:stu) {
			System.out.println(s);
		}
 	}

}
