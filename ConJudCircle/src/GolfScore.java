//------------------------------------------------------------------------------
//  @Classname: GolfScore.java                @Author: Kevin Mitnick
//  @Date: 2018年1月13日上午11:27:49
//  @Description: 处理高尔夫球得分问题
//------------------------------------------------------------------------------

import java.util.Scanner;
import java.io.*;

public class GolfScore
{
	public static void main(String[] args) throws IOException
	{
		Scanner fileScan;
		int golfer1 = 0, golfer2 = 0, golfer3 = 0, golfer4 =0;
		int average = 0;
		
		String pathname = "/home/kevin/test.txt";   //文件以后可能会被删除导致文件无法运行
		
		File filename = new File(pathname);
		fileScan = new Scanner(filename);
		
		int i =1;
		while (fileScan.hasNext())
		{
			average += fileScan.nextDouble();
			golfer1 += fileScan.nextInt();
			golfer2 += fileScan.nextInt();
			golfer3 += fileScan.nextInt();
			golfer4 += fileScan.nextInt();
			
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		System.out.println("平均杆数为 "+average);
		System.out.println("一号手杆数 "+golfer1);
		System.out.println("二号手杆数 "+golfer2);
		System.out.println("三好手杆数 "+golfer3);
		System.out.println("四号手杆数 "+golfer4);
		
		fileScan.close();
	}
}
