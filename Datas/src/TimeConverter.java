//以小时、分、秒读取时间长度，然后全部转换成秒
import java.util.Scanner;
public class TimeConverter {
	public static void main(String[] args)
	{
		int hour, minute, second;
		int secondall;
		
		System.out.println("请输入时、分、秒：");
		Scanner scan = new Scanner(System.in);
		hour = scan.nextInt();
		minute = scan.nextInt();
		second = scan.nextInt();
		
		secondall = hour*3600 + minute*60 + second;
		System.out.println("转换成秒为："+secondall);
		
		scan.close();
	}

}
