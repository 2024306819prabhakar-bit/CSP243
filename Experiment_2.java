package assignment;
class operations {
public void add() {
	int a=6;
	int b=8;
	int c=a+b;
	System.out.println("add:"+c);
}
public void subtract() {
	int a=9;
	int b=5;
	int c=a-b;
	System.out.println("Subtarct:"+c);
}
public void multiply() {
	int a=8;
	int b=9;
	int c=a*b;
	System.out.println("Multiply:"+c);
	
}
public void divide() {
	int a=8;
	int b=2;
	int c=a/b;
	System.out.println("Divide:"+c);
}
public void remainder() {
	int a=19;
	int b=8;
	int c=a%b;
	System.out.println("Remiander:"+c);
}

}


public class Experiment_2 {
	public static void main(String[] args) {
		operations oper=new operations();
		oper.add();
		oper.subtract();
		oper.multiply();
		oper.divide();
		oper.remainder();
		
	}

}
