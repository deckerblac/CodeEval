import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class remove_char {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("delete.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] word = line.split("[\t]");
			for (String string : word) {
				int comma = string.indexOf(",");
				 String Char = new String (string.substring(comma));
				 int length = string.length();
				 int length2 = Char.length();
				for (int j = 0; j < length2; j++) {
					char m = Char.charAt(j);
					for (int i = 0; i < length; i++) {
					if(string.charAt(i) == m){
					string = string.replace(string.charAt(i), ' ');
					}
				  }
				}
				System.out.println(string);
				
			}
			
		}
	}

}
