/**
 * @author kevin
 * 读入一个double型的浮点值，然后分别输出不大于该值的最大整数和不小于该值的最小整数
 */

import java.util.Scanner;

public class IntAdjacent {
	public static void main(String[] args) {
		double num;
		int maxInt, minInt;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入一个double型的浮点值：");
		num = scan.nextDouble();
		//maxInt = (int) num;
		//minInt = maxInt + 1;
		maxInt = (int) Math.floor(num);
		minInt = (int) Math.ceil(num);
		System.out.println("不大于该值的最大整数："+maxInt
				+"\n不小于该值的最小整数："+minInt);
	}
}
