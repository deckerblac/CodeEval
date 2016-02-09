import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fibonacci {

	public static void main (String[] args) throws IOException {
        File file = new File("fib.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] addition = line.split(" ");
            int[] myAddition = new int[addition.length];
            int convert = 0;
            for (int i = 0; i < myAddition.length; i++) {
				myAddition[i] = Integer.parseInt(addition[i]);
				convert = myAddition[i];
			}
            System.out.println(fib(convert));
            
               
        }
    }
	
	public static int fib(int n){
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}else {
			return fib(n - 1) + fib(n - 2);
		}
	}

}
