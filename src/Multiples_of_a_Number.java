/* Sample code to read in test cases:*/
import java.io.*;
public class Multiples_of_a_Number {
    public static void main (String[] args) throws IOException {
        File file = new File("multiple.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] power = line.split(",");
            int[] myPower = new int[power.length];
            for (int i = 0; i < power.length; i++) {
             String numberAsString = power[i];	
			 myPower[i] = Integer.parseInt(numberAsString);
			 int convert = myPower[i];
 			}
            System.out.println(Multiply(myPower));
            
           /* int result = Multiply(myPower);
			 if (result > 0) //or != if you work with negatives
			 {
			 System.out.println(result);
			 } */
            
        }  
    }
    
    public static int Multiply(int[] n){
    	int t= n[1];
    	for (int i = 0; i < n.length; i++) {
			if(n[1] <= n[0]){
  			  t = (int) Math.pow(n[1],2);

			}else {
				
			}
		}
    	/*while (n.length < n.length-1) {
	    t = (int) Math.pow(n.length, 2);
		}*/
    	return t;
    }
}

/*static long leastCommonMultiple(long n) {
    long multiple = 1;

    for ( long i = 2; i <= n; i++ ) {
        multiple *= i / gcd(i, multiple);
    }

    return multiple;
    
    static long gcd(long a, long b) {
    while ( 0 != b ) {
        long temp = a;
        a = b;
        b = temp % b;
    }

    return a;
}
}*/
