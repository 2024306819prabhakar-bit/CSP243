package classCode;
import java.util.*;
public class code5 {
 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter string: ");
	        String s = sc.nextLine();

	        int count[] = new int[256];
	        for (char c : s.toCharArray())
	            count[c]++;

	        int max = 0;
	        char result = ' ';
	        for (char c : s.toCharArray()) {
	            if (count[c] > max) {
	                max = count[c];
	                result = c;
	            }
	        }
	        System.out.println("Maximum occurring char: " + result);
	        sc.close();
	    }
	    
	}


