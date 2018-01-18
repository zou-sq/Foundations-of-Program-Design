/**
 * @author kevin
 * 提示用户输入三角形的三条边长，使用Heron公式计算三角形的面积并保留三位小数
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Heron {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double s, a, b, c, area;
		System.out.println("请输入三角形的三条边长：");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		s = (a + b + c)/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		System.out.println("三角形面积为："+fmt.format(area));
		scan.close();
	}
}
