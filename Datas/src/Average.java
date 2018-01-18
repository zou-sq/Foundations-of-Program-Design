import java.util.Scanner;
public class Average {
	public static void main(String[] args)
	{
		int num1, num2, num3;
		double average;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter three number:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		average = (num1+num2+num3)/3;
		
		System.out.println("The average is: "+average);
	
		scan.close();
	}
	

}