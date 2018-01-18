// 读取两个浮点数，然后输出它们的和、差及乘积
import java.util.Scanner;
public class Sumdifpro {
	public static void main(String[] args)
	{
		double num1, num2;
		double sum, dif, pro;
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入两个浮点数：");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		
		sum = num1+num2;
		dif = num1-num2;
		pro = num1*num2;
		
		System.out.println("和："+sum);
		System.out.println("差："+dif);
		System.out.println("积："+pro);
		
		scan.close();
		
	}

}
