/**
 * @author kevin
 * 输入一个球体的半径，使用公式输出体积和表面积
 * 结果保留四位小数
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Countvs {
	public static void main(String[] args) {
		double r, v, s;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入半径：");
		r = scan.nextDouble();
		
		v = (4/3) * Math.PI * Math.pow(r,  3);
		s = 4 * Math.PI * Math.pow(r,  2);
		
		DecimalFormat fmt = new DecimalFormat("0.####");
		System.out.println("球体积为："+fmt.format(v)
				+"\n表面积为："+fmt.format(s));
		scan.close();
	}
}
