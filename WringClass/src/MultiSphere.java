//------------------------------------------------------------
//  @Classneme: MultiSphere.java        Author: Kevin Mitnick
//  @Date: 2018年1月10日下午7:22:56
//  @Description: 一个驱动类，其main方法实例化并返回一些Sphere对象
//------------------------------------------------------------

import java.util.Scanner;

public class MultiSphere {
	public static void main(String[] args) {
		double diam;
		double vol, acr;
		String str;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入球的直径：");
		diam = scan.nextDouble();
		Sphere test;
		test = new Sphere(diam);
		
		vol = test.getBallVol();
		acr = test.getBallAcr();
		str = test.toString(vol,  acr);
		
		System.out.println(str);
		scan.close();
	}
}
class Sphere {
	private double diam, vol, acr;
	
	//构造方法：接收并初始化直径值
	public Sphere(double d) {
		diam = d;
	}
	
	//计算并返回球的体积
	public double getBallVol() {
		vol = 4/3 * Math.PI * Math.pow(diam/2, 3);
		return vol;
	}
	
	//计算并返回球的表面积
	public double getBallAcr() {
		acr = 4 * Math.PI * Math.pow(diam/2, 2);
		return acr;
	}
	
	//返回一行描述该球体的字符串
	public String toString(double v, double s) {
		String result = "这是一个半径"+diam/2+"的球体，体积为"+v+"表面积为"+s;
		return result;
	}
}