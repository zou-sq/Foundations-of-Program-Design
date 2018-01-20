/**2018年1月19日  12:44
 *    反序输出字符串
 */ 

import java.util.Scanner;

public class Reverse 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str;
		
		while (scan.hasNext())
		{
			str = scan.next();
			
			for (int i = 0; i < str.length(); i++)
			{
				System.out.print(str.charAt(str.length() - i - 1));
				
			}
			
			System.out.println();
		}
		
		scan.close();
	}
}
