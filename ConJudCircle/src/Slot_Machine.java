//------------------------------------------------------------------------------
//  @Classname: Slot_Machine.java                @Author: Kevin Mitnick
//  @Date: 2018年1月12日下午2:26:50
//  @Description: 模拟一台简单的老虎机，三个数字将从0-9中随机选取并且并排显示
//                 当三个数字都相同或其中两个相同时，分别输出适当的语句
//------------------------------------------------------------------------------

import java.util.Random;
import java.util.Scanner;
public class Slot_Machine 
{
	public static void main(String[] args) 
	{
		int num1, num2, num3;
		String str = "y";
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		
		while (str.equalsIgnoreCase("y"))
		{
			num1 = generator.nextInt(10);
			num2 = generator.nextInt(10);
			num3 = generator.nextInt(10);
				
			if (num1 == num2 && num1 == num3)
				System.out.println("恭喜中了一等奖！");
			else if (num1 == num2 || num1 == num3 || num2 == num3)
				System.out.println("恭喜中了二等奖！");
			else
				System.out.println("谢谢惠顾，欢迎再来。");
			
			System.out.println("还要再玩吗？(y/n)");
			str = scan.nextLine();
		}
		scan.close();
	}
}
