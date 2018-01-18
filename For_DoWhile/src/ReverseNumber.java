//---------------------------------------------------------------------------
//  @Classneme: ReverseNumber.java        Author: Kevin Mitnick
//  @Date: 2018年1月14日下午4:45:49
//  @Description: 从用户那里读入一个整数值，并用数学的方法将该值的数位反序后输出
//---------------------------------------------------------------------------

import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args)
	{
		int number, lastDight, reverse = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入一个正整数：");
		number = scan.nextInt();
		
		do
		{
			lastDight = number % 10;
			reverse = (reverse * 10) + lastDight;
			number = number / 10;
		}
		while (number > 0);
		
		System.out.println("反序后的整数是：" + reverse);	
		scan.close();
	}
}