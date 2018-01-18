/**
 * @author kevin
 * 产生[20,40]区间的整型随机数，并显示这些随机数的正弦、余弦和正切值
 */

import java.util.Random;

public class Randomintreval {
	public static void main(String[] args) {
		int num;
		double sin, cos, tan;
		Random generator = new Random();
		num = generator.nextInt(21) + 20;
		sin = Math.sin(num);
		cos = Math.cos(num);
		tan = Math.tan(num);
		
		System.out.println("随机数："+num
				+"\n正弦值："+sin
				+"\n余弦值："+cos
				+"\n正切值："+tan);
	}
}
