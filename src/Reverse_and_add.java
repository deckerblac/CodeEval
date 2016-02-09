import java.io.*;
public class Reverse_and_add {

	public static void main (String[] args) throws IOException {
        File file = new File("addition.txt");
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
           int  result=0;
           int count =0;
           result = convert + reverse(convert);
           while (result != reverse(result)) {
        	   result = result + reverse(result);
				 System.out.println(count+" "+result);
				 count++;
		     }
               
        }
        
        
    }
	
	public static int reverse(int n){
		int reverse = 0;
		while( n != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
		return reverse;
	}
	
	
}

 

