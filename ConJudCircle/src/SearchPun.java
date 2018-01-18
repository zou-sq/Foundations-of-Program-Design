//------------------------------------------------------------------------------
//  @Classname: SearchPun.java                @Author: Kevin Mitnick
//  @Date: 2018年1月13日下午8:28:31
//  @Description: 统计一个文本文件有多少个标点符号并将每个输出
//------------------------------------------------------------------------------

//本程序用的方法比较笨拙，因为还不是太了解标点符号的一些知识，比如/pP如何表示所有的标点符号，具体
//是怎么操作的，因此我自己定义了一个尽可能将所有的标点符号定义成了一个字符串，这是百度知道里一个回
//答给我的提示，我觉得应该是很笨拙的办法吧，因为花的时间太长了，现在已经22:10了，快两个小时了都，
//暂时先不想这个问题了，方法下面我尽可能多给一些注释

import java.util.Scanner;
import java.io.*;

public class SearchPun 
{
	public static void main(String[] args) throws IOException
	{
		int num = 0;       //统计标点符号个数
		
		String path = "/home/kevin/readme.txt", str;        //文件路径，以后应该会更改导致程序无法执行，自行修改路径吧
		Scanner fileScan;
		File file = new File(path);
		fileScan = new Scanner(file);               //利用Scanner类扫描文件
		
		String pun = ",.?;:'\"!`、‘“；：？。，";      //就是这个我自己定义的标点符号，包括中文英文，应该有遗漏
		
		int strtest;    //对依次读取到的字符串的每一个字符与pun比较
		
		while (fileScan.hasNext())    //有下一个字符串输入
		{
			str = fileScan.next();
			strtest = 0;             //从零开始比较
			
			//对每个字符串进行标点符号的判断
			while (strtest < str.length())
			{
				int puntest = 0;     
				
				//将pun的每个字符，即每个标点符号与str的字符比较
				while (puntest < pun.length() )
				{
					if (pun.charAt(puntest) == str.charAt(strtest))    //若存在标点符号
					{
						System.out.println(str.charAt(strtest));    //输出这个标点符号
						num++;               //标点符号数加一
					}
					puntest++;         //与标点符号字符串下一个比较
				}
				
				strtest++;              //下一个字符串开始比较
			}
		}
		
		System.out.println(num+"个标点符号");
		fileScan.close();
	}
}














