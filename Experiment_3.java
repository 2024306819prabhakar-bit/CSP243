package assignment;
import java.util.Scanner;

class CheckEven{
	public int even(int num) {
		if(num %2==0) {
			return 1;
		}
		else{
			return 0;
			
		}
	}
}

public class Experiment_3 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter here a number");
		int num =scan.nextInt();
		
		CheckEven check=new CheckEven();
		int result=check.even(num);
            System.out.println("Result:"+ result);
		scan.close();
	}

}
