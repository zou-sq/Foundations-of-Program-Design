//------------------------------------------------------------------------------
//  @Classname: Hi_Lo.java                @Author: Kevin Mitnick
//  @Date: 2018年1月11日下午6:41:29
//  @Description:    猜数字游戏
//------------------------------------------------------------------------------

import java.util.Scanner;
import java.util.Random;

public class Hi_Lo {
	public static void main(String[] args) {
		int time = 0, answer, question;
		boolean choice = true;
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		while (choice == true) {
			System.out.println("请输入你猜测的数字：");
			answer = scan.nextInt();
			question = generator.nextInt(100) + 1;
			
			while (answer != question) {
				if (answer > question)
					System.out.println("您猜测的值大了。");
				else
					System.out.println("您猜测的值小了。");
				
				time++;
				answer = scan.nextInt();
			}
			
			time++;
			System.out.println("恭喜你，回答正确！");
			System.out.println("你一共答了"+time+"次。");			
			System.out.println("还想再玩吗？（true or false）:");
			choice = scan.nextBoolean();
			
			time = 0;
		}
		scan.close();		
	}
}














