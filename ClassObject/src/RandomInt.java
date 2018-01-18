/**
 * @author kevin
 * 产生[1,20]区间的整型随机数，得到圆柱体的半径和高度
 */

import java.util.Random;

public class RandomInt {
	public static void main(String[] args) {
		Random generator = new Random();
		int r, h;
		double v, s;
		
		r = generator.nextInt(20) + 1;
		h = generator.nextInt(20) + 1;
		
		v = Math.PI*Math.pow(r,  2)*h;
		s = 2*Math.PI*r*h;
		
		System.out.println("面积："+s+"体积："+v);
	}
}
