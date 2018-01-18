/**
 * @author kevin
 * 随机生成并输出XXX-XXX-XXX类型的随机电话号码
 * 前三个数字不能有8或者9
 * 中间三个数字的组成数不能大于655
 */

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int a, b, c, d, e;
		Random generator = new Random();
		
		a = generator.nextInt(78);
		b = generator.nextInt(656);
		c = generator.nextInt(1000);
		d = generator.nextInt(8);
		e = a + d*100;
		
		String str1 = String.format("%03d", e);
		String str2 = String.format("%03d", b);
		String str3 = String.format("%03d", c);
		
		System.out.println(str1+"-"+str2+"-"+str3);
	}
}
