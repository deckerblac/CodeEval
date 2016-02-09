import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class permute {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//permuteMe("abc");
		File file = new File("permute.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null ) {
            line = line.trim();
        	String[] word = line.split(" ");
            for (String string : word) {
            	char[] chars = string.toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);
                String result ="";
                /*while(sorted != " "){
                	result += sorted + ",";
                }*/
                
            	permuteMe(sorted);
			}
            
    }
	}
	
	
	public static void permuteMe(String str){
		int length = str.length();
		boolean[]used = new boolean[length];
		StringBuffer output = new StringBuffer(length);
	
		permutation(str,length, output, used,0);
	}
	
	
	public static void permutation(String str,int length, StringBuffer output,boolean[] used,int position){
		length = str.length();
		if(position == length){
			System.out.println(output.toString());
			return;
		}
		
		else{

			for(int i =0; i < length; i++){
			/*if the "ith" character has been used move on to the next character
		        [a][b][c]
			     ^
			     used
			     [a][b][c]
			         ^
			         used
			         [a][b][c]
			                ^
			                used
			*/
				if(used[i] == true) continue;
				
				output.append(str.charAt(i));
				used[i] = true;
			
			
			permutation(str,length, output, used,position + 1);
		/*        c
		 *       /
		 *   / b 
		 * a
		 *   \ c
		 *       \b
		 * 
		 * 
		 * */
		    output.deleteCharAt(output.length()-1);
		    //System.out.println("We are at postion :" + output.charAt(output.length()-1));
			used[i] = false;
			}
		}
	}

}
