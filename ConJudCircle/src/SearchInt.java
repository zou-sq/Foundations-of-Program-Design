//------------------------------------------------------------------------------
//  @Classname: SearchInt.java                @Author: Kevin Mitnick
//  @Date: 2018年1月13日下午6:35:13
//  @Description: 计算一个文本文件中有多少个整数并将每一个整数输出
//------------------------------------------------------------------------------

import java.util.Scanner;
import java.io.*;

public class SearchInt 
{
	public static void main(String[] args) throws IOException
	{
		int num = 0;
		
		String path = "/home/kevin/readme.txt";
		Scanner fileScan;
		File file = new File(path);
		fileScan = new Scanner(file);
		
		
		while (fileScan.hasNext())
		{
			if (fileScan.hasNextInt())
			{
				System.out.println(fileScan.nextInt());
				num++;
			}
			else
				fileScan.next();
		}
		System.out.println(num+"个整数");
		
		
		fileScan.close();
	}
}
