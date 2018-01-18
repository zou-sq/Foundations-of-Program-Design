/**
 * @author kevin
 * 用户输入名字和姓氏，然后输出字符串
 * 该字符创由用户名字的首字母，加上不超过前5个字母的姓氏以及一个10~99的随机数组成
 */

import java.util.Scanner;
import java.util.Random;

public class UserACcount {
	public static void main(String[] args) {
		int a;
		char first;
		String firstname, lastname, last;
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Your firstname: ");
		firstname = scan.next();
		System.out.println("Your lastname: ");
		lastname = scan.next();
		
		first = firstname.charAt(0);
		a = lastname.length();
		if(a >4)
			last = lastname.substring(0, 5);
		else
			last = lastname;
		
		
		Random generator = new Random();
		int num;
		num = generator.nextInt(90) + 10;
		
		System.out.println("Your useracount: "+first+last+num);
		scan.close();
	}
}
