import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class longest_Line {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		List<String> list = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line;
		while (true) {
			line = reader.readLine();
			if (line == null) {
				break;
			}
			list.add(line);
		}
		// Close it.
		reader.close();
		Collections.sort(list, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() > s2.length()) {
					return -1;
				} else if (s1.length() < s2.length()) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		for (String str : list) {
			System.out.println(str);
		}

	}

}

	