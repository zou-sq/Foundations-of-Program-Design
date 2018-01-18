
//------------------------------------------------------------
//  @Classneme: BoxTest.java        Author: Kevin Mitnick
//  @Date: 2018年1月11日下午12:00:59
//  @Description: 一个BoxTest驱动类，main方法实例化并返回一些Box对象
//------------------------------------------------------------
public class BoxTest {
	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		
		String str1;
		
		box1.setHeight(5);
		box2.setThickness(6);
		box3.setWidth(8);
		box1.setState(true);
	
		str1 = box1.toString();
		System.out.println(str1);
	}
}

//Box类，实例数据分别表示箱子的高度、宽度和厚度
//一个布尔型实例变量数据full表示箱子是否装满
class Box{
	double height, width, thickness;
	boolean full;
	
	//构造方法：初始化为空，full初始化为false
	public Box() {
		height = width = thickness = 0;
		full = false;
	}
	
	//获取高度
	public double getHeight() {
		return height;
	}
	
	//获取宽度
	public double getWidth() {
		return width;
	}
	
	//获取厚度
	public double getThickness() {
		return thickness;
	}
	
	//获取状态
	public boolean getState() {
		return full;
	}
	
	//设置高度
	public void setHeight(double hei) {
		height = hei;
	}
	
	//设置宽度
	public void setWidth(double wid) {
		width = wid;
	}
	
	//设置厚度
	public void setThickness(double thick) {
		thickness = thick;
	}
	
	//设置状态
	public void setState(boolean state) {
		full = state;
	}
	
	public String toString() {
		System.out.println("这个箱子是否空："+full);
		return "返回来了一行描述箱子的字符串，快接着！";
	}
}