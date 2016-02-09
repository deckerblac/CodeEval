/* Sample code to read in test cases:*/
import java.io.*;
public class Reverse_words {
    public static void main (String[] args) throws IOException {
 File file = new File("word.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null ) {
            line = line.trim();
        	String[] word = line.split("\n");
            for (int i = 0; i < word.length; i++) {
           System.out.printf("%s\n",reverseString(word[i]));
			}
             
    }
    }
    
  public static String reverseString(String str){  
	  int spaceIndex = str.indexOf(" "); //index of a first space character
	  String first = str.substring(0, spaceIndex);
	  String rest = str.substring(spaceIndex + 1); 

	  String reversed = rest + " " + first;
	return reversed; 
}
  
  
  
}

