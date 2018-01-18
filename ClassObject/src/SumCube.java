/**
 * @author kevin
 * 提示用户输入两个整数，然后输出两个整数的立方值之和
 */

import java.util.Scanner;

public class SumCube {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("请输入两个整数（以空格号分开）：");
		a = scan.nextInt();
		b = scan.nextInt();
		
		c = (int) (Math.pow(a, 3) + Math.pow(b, 3));
		System.out.print("两个整数的立方值之和为： "+c);
		scan.close();
	}
}
