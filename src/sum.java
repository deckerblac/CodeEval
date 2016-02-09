

import java.io.*;

public class sum {

	public static void main (String[] args) throws IOException {
        File file = new File("fib.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int total = 0;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int k = Integer.parseInt(line);
            total += k;
			}
            	 System.out.println(total);
               
        }
    }
	



