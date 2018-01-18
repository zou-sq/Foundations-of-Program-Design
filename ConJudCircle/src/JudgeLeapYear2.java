//------------------------------------------------------------------------------
//  @Classname: JudgeLeapYear2.java                @Author: Kevin Mitnick
//  @Date: 2018年1月11日下午4:30:08
//  @Description: JudgeLeapYear.java的升级版
//------------------------------------------------------------------------------

import java.util.Scanner;

public class JudgeLeapYear2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;
		
		System.out.println("请输入若干个年份（以0结束输入)：");
		year = scan.nextInt();
		while (year != 0) {
			if (year <1582) {
				System.out.println(year+"不是正确的值！\n");
			}
			else if ((year%4 == 0&&year%100 != 0)||(year%100 == 0 && year%400 == 0)) {
				System.out.println(year + "是闰年！\n");
			}
			else {
				System.out.println(year + "不是闰年！\n");
			}
			
			year = scan.nextInt();
		}
		scan.close();
	}
}
