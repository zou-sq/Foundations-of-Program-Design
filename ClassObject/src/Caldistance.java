/**
 * @author kevin
 * 输入两个点的坐标值，根据公式计算两点间的距离
 */

import java.util.Scanner;

public class Caldistance {
	public static void main(String[] args) {
		double x1, x2, y1, y2, square, distance;
		Scanner scan = new Scanner(System.in);
	
		System.out.println("请输入点坐标(不需输入括号，以空格隔开)：");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		square = Math.pow(x1-x2,  2) + Math.pow(y1-y2,  2);
		distance = Math.sqrt(square);
		System.out.println("距离为："+distance);
		scan.close();
	}
}
