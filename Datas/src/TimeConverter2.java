//读入以秒为单位的时间长度，然后换成小时、分和秒的组合表达方式并输出结果
import java.util.Scanner;
public class TimeConverter2 {
	public static void main(String[] args)
	{
		int hour, minute, second;
		int secondall;
		
		Scanner enter = new Scanner(System.in);
		System.out.println("请输入秒数：");
		secondall = enter.nextInt();
		hour = secondall/3600;
		minute = (secondall - hour*3600)/60;
		second = secondall - hour*3600 - minute*60;
		
		System.out.println("转换成："+hour+"时"+minute+"分"+second+"秒");
		enter.close();
	}

}
