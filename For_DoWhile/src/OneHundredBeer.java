//-------------------------------------------------------------------------------
//  @Classneme: OneHundredBeer.java        Author: Kevin Mitnick
//  @Date: 2018年1月14日下午10:03:30
//  @Description: 输出歌曲“One Hundred Bottles of Beer”的前几段歌词，利用一个循环，每
//                循环一次输出一段歌词，输出的段数由用户输入。
//-------------------------------------------------------------------------------

import java.util.Scanner;

public class OneHundredBeer 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("你想输出几段歌词：");
		num = scan.nextInt();
		
		for (int i = 0; i < num; i++)
		{
			System.out.println(100 - i + " bottles of beer on the wall");
			System.out.println(100 - i + " bottles of beer");
			System.out.println("If one of those bottles should happen to fall");
			System.out.println(100 - i -1 + " bottles of beer on the wall");
			System.out.println();
		}
		
		scan.close();
	}

}
