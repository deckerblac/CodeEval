import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class sum_of_digits {
        public static void main(final String[] args) throws IOException {
                // Read file from specified path.
                BufferedReader reader = new BufferedReader(new FileReader(new File("sumdigits.txt")));
                String line;

                while ((line = reader.readLine()) != null) {
                        int sum = 0;
                        // Iterate through the digits.
                         int digitCount = line.length();
                        for (int i = 0; i < digitCount; i++) {
                                try {
                                        // Use this instead of Character.getNumericValue to avoid accidentally parsing
                                        // non-numeric characters if given invalid input.
                                        sum += Integer.parseInt(new String(new char[] { line.charAt(i) }));
                                } catch (final NumberFormatException e) {
                                        throw new RuntimeException("Input file contained non-numeric arguments.");
                                }
                        }

                        // Output the sum.
                        System.out.println(sum);
                }
        }
}
