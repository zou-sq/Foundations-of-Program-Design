//------------------------------------------------------------
//  @Classneme: CarTest.java        Author: Kevin Mitnick
//  @Date: 2018年1月11日上午11:00:18
//  @Description: CarTest驱动类，其main方法实例化并返回一些Car对象
//------------------------------------------------------------
public class CarTest {
	public static void main(String[] args) {
	String str;
	Car test;
	
	test = new Car();
	str = test.toString();
	
	System.out.println(str);
	System.out.println("是否古董车："+test.isAntique());
	}
}
 //一个Car类，其实例数据分别表示汽车厂商名称、型号和出厂年份
class Car{
	private String name, model;
	private long date;
	
	//构造方法，初始化这些值
	public Car() {
		name = "Maserati";
		model = "Maserati Levante";
		date = 20110101;
	}
	
	//获取汽车厂商名字
	public String getName() {
		return name;
	}
	
	//获取型号
	public String getModel() {
		return model;
	}
	
	//获取出厂年份
	public long getDate() {
		return date;
	}
	
	//返回一串描述这辆车的字符串
	public String toString() {
		return "一辆玛莎拉蒂"+name+"型号："+model+"出厂日期："+date;
	}
	
	//返回一个表示这辆车为古董车的布尔值（>45年）
	public boolean isAntique() {
		return ((2018-2011)>45);
	}
}