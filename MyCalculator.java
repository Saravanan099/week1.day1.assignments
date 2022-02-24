package week1.day1.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int addCal = obj.addNumber(1,2,3);
		int subCal = obj.subNumber(100,50);
		double mulCal = obj.mulNumber(10,10);
		float divCal = obj.divideNumber(4,2);
		
	System.out.println("Sum: " +addCal);
	System.out.println("Subtraction: " +subCal);
	System.out.println("Multiply: " +mulCal);
	System.out.println("Division: " +divCal);
	}

}
	