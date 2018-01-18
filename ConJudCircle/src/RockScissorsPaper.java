//------------------------------------------------------------------------------
//  @Classname: RockScissorsPaper.java                @Author: Kevin Mitnick
//  @Date: 2018年1月12日下午12:51:18
//  @Description: 一个和计算机程序交互的“石头-剪刀-布”游戏程序。
//------------------------------------------------------------------------------

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class RockScissorsPaper 
{
	public static void main(String[] args) 
	{
		int draw = 0, man1bingo = 0, man2bingo = 0;
		String computer, man1, man2, another = "y";
		ArrayList<String> choice = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		Random generator = new Random();
		
		choice.add("石头");
		choice.add("剪刀");
		choice.add("布");
		
		while (another.equalsIgnoreCase("y"))
		{
			
		
			computer = choice.get(generator.nextInt(2));
		
			System.out.println("请甲独自输入你的选择（石头、剪刀 or 布）：");
			man1 = scan.nextLine();
			System.out.println("请乙独自输入你的选择（石头、剪刀 or 布）：");
			man2 = scan.nextLine();
		
			System.out.println("计算机的选择是：" + computer);
			
			//判断甲乙输赢以及和局
			if (choice.indexOf(man1) == choice.indexOf(man2)) 
			{
				System.out.println("和局");
				draw++;
			}
			else if (choice.indexOf(man2) - choice.indexOf(man1) == 1 || choice.indexOf(man1) - choice.indexOf(man2) == 2) 
			{
				System.out.println("甲赢了");
				man1bingo++;
			}
			else
			{
				System.out.println("乙赢了");
				man2bingo++;
			}
			
			System.out.println("还要再玩一次吗？（y/n）");
			another = scan.nextLine();
		}//while
		
		System.out.println();
		System.out.println("和局： "+draw+"次");
		System.out.println("甲赢： "+man1bingo+"次");
		System.out.println("乙赢： "+man2bingo+"次");
		
		scan.close();
	}
}
