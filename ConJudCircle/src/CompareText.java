//------------------------------------------------------------------------------
//  @Classname: CompareText.java                @Author: Kevin Mitnick
//  @Date: 2018年1月13日下午5:36:19
//  @Description: 逐行比较两个文本文件的相等性，输出所有不相同的行
//------------------------------------------------------------------------------

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class CompareText 
{
	public static void main(String[] args) throws IOException
	{
		int differrow = 1;
		Scanner file1Scan, file2Scan;
		
		String path1 = "/home/kevin//test3.txt";                      //文件以后可能会被删除导致程序无法运行
		String path2 = "/home/kevin/桌面/Code/Code/day01/test2.txt";   //文件以后可能会被删除导致文件无法运行
		
		File file1 = new File(path1);
		File file2 = new File(path2);
		
		file1Scan = new Scanner(file1);
		file2Scan = new Scanner(file2);
		
		while (file1Scan.hasNext() && file2Scan.hasNext())
		{
			if (file1Scan.nextLine().equals(file2Scan.nextLine()));
			else
				System.out.println("第"+differrow+"行不相同。");
			
			differrow++;                 //行数加一
		}
		
		file1Scan.close();
		file2Scan.close();
	}
}









