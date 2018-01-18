//------------------------------------------------------------------------------
//  @Classname: JudegeIntFloZero.java                @Author: Kevin Mitnick
//  @Date: 2018年1月11日下午4:50:53
//  @Description: 从键盘读入一个整数，然后输出该整数包含的奇数、偶数和零数字的个数
//------------------------------------------------------------------------------

import java.util.Scanner;

public class JudegeIntFloZero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0, i=0, j = 0;
		int odd = 0, even = 0, zero =0;     //记录奇数、偶数、零
		String str;
		char index;
		
		System.out.println("请输入整数：");
		num = scan.nextInt();
		
		str = Integer.toString(num);  //将输入的整数转化为字符串存储
		
		j = str.length();
		
		while (i < j) {
			index = str.charAt(i);
			 int number;
			 number = Character.getNumericValue(index);  //字符回归整数
			 
			 if (number%2 == 0) {
				 even++;
				 if (number == 0)
					 zero++;
				 }
			 else 
				 odd++;
			 
			 i++;
		}
		
		System.out.println("该整数包含奇数："+odd+"个");
		System.out.println("该整数包含偶数 "+even+"个");
		System.out.println("该整数包含零数 "+zero+"个");
		
		scan.close();
	}
}



















