package collections;

import java.io.*;
import java.util.*;

public class duplicateword extends Thread{
	private String path;

	public duplicateword(String path) {
		this.path = path;
	}
	
	@Override
	public void run() {
		List<String> lst = new ArrayList<>();
		
		try {
			FileReader fr = new FileReader(path);
			
			int x;
			char c;
			String cont = "";
			int count = 0;
			while((x = fr.read()) != -1) {
				c = (char)x;
				cont += c;
			}
			fr.close();
			
			String word[] = cont.split("\\s++");
			String printed = "";
			for(int i =0;i < word.length;i++) {
				count = 0;
				for(int j = 0; j < word.length;j++) {
					if(word[i].equals(word[j])) {
						count++;
					}
				}
				if(count > 1 && !printed.contains(word[i]+" ")) {
					lst.add(word[i]);
					printed +=word[i]+" ";
				}
			}
			System.out.println("--Duplicate words are--");
			lst.forEach(System.out::println);		
			
			//printing the reverse of list
			System.out.println("reverse of list is");
			for(int i = lst.size() - 1; i >=0;i--) {
				System.out.println(lst.get(i));
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
