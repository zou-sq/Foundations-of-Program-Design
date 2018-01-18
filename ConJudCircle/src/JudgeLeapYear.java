//------------------------------------------------------------------------------
//  @Classname: JudgeLeapYear.java                @Author: Kevin Mitnick
//  @Date: 2018年1月11日下午4:03:09
//  @Description:
//------------------------------------------------------------------------------

import java.util.Scanner;

public class JudgeLeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;
		
		System.out.println("请输入一个整数作为年份：");
		year = scan.nextInt();
		if (year <1582) {
			System.out.println("输入错误！！！");
		}
		else if ((year%4 == 0&&year%100 != 0)||(year%100 == 0 && year%400 == 0)) {
			System.out.println("您输入的年份是闰年！");
		}
		else {
			System.out.println("您输入的年份不是闰年！");
		}
		scan.close();
	}
}
