//-------------------------------------------------------------------------------
//  @Classneme: Mobile_Keyboard.java        Author: Kevin Mitnick
//  @Date: 2018年1月19日下午11:58:20
//  @Description: 按照手机键盘输入字母的方式，计算所花费的时间 如：a,b,c都在“1”键上，输入a只
//                需要按一次，输入c需要连续按三次。 如果连续两个字符不在同一个按键上，则可直接按，
//                如：ad需要按两下，kz需要按6下 如果连续两字符在同一个按键上，则两个按键之间需要
//                等一段时间，如ac，在按了a之后，需要等一会儿才能按c。 现在假设每按一次需要花费
//                一个时间段，等待时间需要花费两个时间段。 现在给出一串字符，需要计算出它所需要
//                花费的时间。
//-------------------------------------------------------------------------------

import java.util.Scanner;

public class Mobile_Keyboard 
{
		public static void main(String[] args)
	{
		int time = 0, confli = 0;
		Scanner scan = new Scanner(System.in);
		
		String str;
		String alph = "abcdefghijklmnopqrstuvwxyz";
		String str1 = "adgjmptw";
		String str2 = "behknqux";
		String str3 = "cfilorvy";
		
		int one = 0, two = 0, thr = 0, four = 0;
		
		str = scan.next();
		
		for (int i = 0; i < str.length(); i++)
		{
			int l1 = alph.indexOf(str.charAt(i));
			
			if (i < str.length() - 1)
			{
				int l2 = alph.lastIndexOf(str.charAt(i + 1));
				
				if (l1 <= 2 && l2 <= 2)
					confli++;
				else if (l1 > 2 && l1 <= 5 && l2 > 2 && l2 <= 5)
					confli++;
				else if (l1 > 5 && l1 <= 8 && l2 > 5 && l2 <= 8)
					confli++;
				else if (l1 > 8 && l1 <= 11 && l2 > 8 && l2 <= 11)
					confli++;
				else if (l1 > 11 && l1 <= 14 && l2 > 11 && l2 <= 14)
					confli++;
				else if (l1 > 14 && l1 <= 18 && l2 > 14 && l2 <= 18)
					confli++;
				else if (l1 > 18 && l1 <= 21 && l2 > 18 && l2 <= 21)
					confli++;
				else if (l1 > 21 && l1 <= 25 && l2 > 21 && l2 <= 25)
					confli++;
			}
			
			//计算每个字母需要按的次数
			for (int j = 0; j < str1.length(); j++)
				if (str.charAt(i) == str1.charAt(j))
					one++;
			for (int k = 0; k < str2.length(); k++)
				if (str.charAt(i) == str2.charAt(k))
					two++;
			for (int l = 0; l < str3.length(); l++)
				if (str.charAt(i) == str3.charAt(l))
					thr++;
			if (str.charAt(i) == 's' || str.charAt(i) == 'z')
				four++;
			
		}
		
		time = one + two * 2 + thr * 3 + four * 4 + confli * 2;
		System.out.println(time);
		
		scan.close();
	}
}