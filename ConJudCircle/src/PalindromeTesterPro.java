//------------------------------------------------------------------------------
//  @Classname: PalindromeTesterPro.java                @Author: Kevin Mitnick
//  @Date: 2018年1月11日下午7:58:05
//  @Description:回文（palindrome）是指顺读和倒读都相同的序列
//               本程序是回文判断的升级版，在测试一个字符串是否为回文时不考虑
//               空格、标点符号及大小写变化。
//------------------------------------------------------------------------------

import java.util.Scanner;

public class PalindromeTesterPro {
	public static void main(String[] args) {
		String str, choice = "y";
		int left, right;
	
		Scanner scan = new Scanner(System.in);
	
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("请输入一个测试字符串：");
			str = scan.nextLine();
			str = str.replaceAll("[\\pP ]", ""); //去掉标点符号、空格
			str = str.toLowerCase();       //所有字母都转成小写
			
			left = 0;
			right = str.length() - 1;
			
			while (str.charAt(left) == str.charAt(right) && left < right) {
				left++;
				right--;
			}
			System.out.println();
			if (left < right)
				System.out.println("这个字符串不是回文。");
			else
				System.out.println("这个字符串是回文。");
			
			System.out.println("还要测试另一个字符串吗？（Y or N）");
			choice = scan.nextLine();
		}
		
		
		scan.close();
	}
}
