package week1.day1.assignments;

public class SumOfDigits {

	public static void main(String[] args) {
	int input =123;
	int sum=0,remainder=0;
	while(input>0)
	{
		remainder = input % 10;
		System.out.println(remainder);
		sum=sum + remainder;
		System.out.println(sum);
		input= input/10;
		System.out.println(input);
	}
	
	System.out.println("The Sum of Digit is :" +sum);
	

	}

}
