package classCode;
import java.util.*;
public class Code6 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter string: ");
	        String s = sc.nextLine();

	        char min = s.charAt(0);
	        for (char c : s.toCharArray())
	            if (c < min)
	                min = c;

	        System.out.println("Minimum character = " + min);
	        sc.close();
	    }
	   
	}


