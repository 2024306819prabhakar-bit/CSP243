package assignment;

import java.util.Scanner;
class CheckNumber{
	public boolean CheckCondition(int first,int second,int third,boolean abc){
		if(abc) {
			return third>second;
			
		}
		else {
			return(second>first&&third>second);
		}
		
	}
}
public class Experiment_4 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter here a first number");
	int num1=scanner.nextInt();
	
	System.out.println("Enter here a second number");
	int num2=scanner.nextInt();
	
	System.out.println("Enter here a third number");
	int num3=scanner.nextInt();
	
	System.out.println("Enter value abc");
	boolean abc=scanner.nextBoolean();
	
	CheckNumber c=new CheckNumber();
	boolean result=c.CheckCondition(num1,num2,num3,abc);
	
	System.out.println("Result:"+result);
	scanner.close();
}
}
