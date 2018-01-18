//-------------------------------------------------------------------------------
//  @Classneme: OutputChar.java        Author: Kevin Mitnick
//  @Date: 2018年1月14日下午9:39:06
//  @Description: 读入一个字符串，然后将字符串的每个字符分行输出
//-------------------------------------------------------------------------------

import java.util.Scanner;

public class OutputChar 
{
	public static void main(String[] args)
	{
		String str;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入一个字符串：");
		str = scan.next();                      //用nextLine()也可以
		
		for (int i = 0; i < str.length(); i++)
			System.out.println(str.charAt(i));
		
		scan.close();
	}

}
