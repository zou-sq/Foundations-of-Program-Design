/**2018年
 * 1月19日
 *  替换空格
 */

import java.util.Scanner;

public class ReplaceBlank {
	public static void main(String[] args) {
		String str1;
		Scanner scan = new Scanner(System.in);

		str1 = scan.nextLine();
		
		for (int i = 0; i < str1.length(); i++)
		{
			if (str1.charAt(i) != ' ')
				System.out.print(str1.charAt(i));
			else
				System.out.print("%20");
		}
		
	}
}