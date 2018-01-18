//-----------------------------------------------------------------------------
//  @Classneme: SumEven.java        Author: Kevin Mitnick
//  @Date: 2018年1月14日下午9:04:11
//  @Description: 读入一个整数并输出从2到该整数之间所有偶数之和，包括2和输入的值。
//                若输入值小于2，输出提示信息。
//-----------------------------------------------------------------------------

import java.util.Scanner;

public class SumEven 
{
	public static void main(String[] args) 
	{
		int num, sum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入一个整数值：");
		num = scan.nextInt();
		
		if (num >= 2)
		{
			for (int even = 2; even <= num; even+=2)
				sum += even;
			
			System.out.println("所有偶数和为：" + sum);
		}
		else
			System.out.println("请输入大于1的数！！！");
		
		scan.close();
	}

}