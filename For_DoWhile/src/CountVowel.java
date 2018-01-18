//----------------------------------------------------------------------------------
//  @Classneme: CountVowel.java        Author: Kevin Mitnick
//  @Date: 2018年1月16日下午10:26:42
//  @Description: 读入用户输入的一个字符串，然后确定并输出每一个小写元音字母在字符串中出现的次数
//----------------------------------------------------------------------------------

import java.util.Scanner;

public class CountVowel
{
	public static void main(String[] args)
	{
		int count_a = 0;
		int count_e = 0;
		int count_i = 0;
		int count_o = 0;
		int count_u = 0;
		String str;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入一个字符串：");
		str = scan.next();
		
		for (int i = 0; i < str.length(); i++)
		{
			switch (str.charAt(i))
			{
				case 'a':
					count_a++;
					break;
				case 'e':
					count_e++;
					break;
				case 'i':
					count_i++;
					break;
				case 'o':
					count_o++;
					break;
				case 'u':
					count_u++;
					break;
				default :
					;
			}
		}
		
		System.out.println("\'a\'的个数" + count_a);
		System.out.println("\'e\'的个数" + count_e);
		System.out.println("\'i\'的个数" + count_i);
		System.out.println("\'o\'的个数" + count_o);
		System.out.println("\'u\'的个数" + count_u);
		
		scan.close();
	}
}
