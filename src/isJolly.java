import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class isJolly {

	public static void main (String[] args) throws IOException {
        File file = new File("jolly.txt");
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
            System.out.println(isJolly(myAddition) ? "Jolly" : "Not jolly");
            
         
        }
    }
	
	 public static boolean isJolly(int[] array) {
	        int[] result = new int[array[0]];
	        for (int i = 0; i < array[0]; i++) {
	            result[i] = i;
	        }
	        for (int i = 1; i < array.length - 1; i++) {
	            int diff = Math.abs(array[i] - array[i + 1]);
	            if(result.length > diff && result[diff] != 0) {
	                array[0]--;
	                result[diff] = 0;
	            }
	        }
	        return array[0] == 1;
	    }

}
