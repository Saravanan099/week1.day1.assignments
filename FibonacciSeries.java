package week1.day1.assignments;
public class FibonacciSeries {
// Goal: To find Fibonacci Series for a given range
 
	public static void main(String[] args) {
		int range=8,firstNum=0,secNum=1,sum; 
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=2;i<=range;i++)//if i iterate from 1 ,i get 9 rows o/p as per pseudo assignment
				{
					sum=firstNum+secNum;
					firstNum=secNum;
					secNum=sum;
					System.out.println(sum);
				}

}

}
