package collections;
import java.io.*;
import java.util.*;
public class uniqueword extends Thread{
		private String filepath;

		public uniqueword(String filepath) {
			this.filepath = filepath;
		}
		
		@Override
		public void run() {
			HashSet<String> hs = new HashSet<>();
			try {
				BufferedReader br = new BufferedReader(new FileReader(filepath));
				
				String line;
				
				while((line = br.readLine()) !=null) {
					String word []= line.split("\\s++");
					for(String w:word) {
						hs.add(w);
					}
				}
				System.out.println("--unique words are--");
				hs.forEach(System.out::println);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
}
