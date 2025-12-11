package collections;

import java.util.*;

public class sortingdemo {
		public static void main(String[] args) {
			List<String> li = new ArrayList<>();
			
			li.add("Dhoni");
			
			li.add("Virat");
			li.add("Shubham");
			
			li.add("Rohit");
			li.add("Bhumrah");
			System.out.println(li);
			ListIterator litr = li.listIterator();
			
			while (litr.hasNext()) {
				String name = (String) litr.next();
				if( name.equals("Virat")) {
					litr.remove();
				}
				if(name.equals("Dhoni")) {
					litr.set("Abhishek");
				}
			}
			Collections.sort(li);
			for(String n: li)
			{
				System.out.println(li);
			}
			
					
		}
}
