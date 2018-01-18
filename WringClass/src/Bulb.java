//------------------------------------------------------------
//  @Classneme: Bulb.java        Author: Kevin Mitnick
//  @Date: 2018年1月10日下午5:48:35
//  @Description: 一个Bulb类，代表一个可以开或关的灯泡
//------------------------------------------------------------
public class Bulb {
	public static void main(String[] args) {
		BulbTest test;
		BulbTest.State x;
		test = new BulbTest();
		test.setBulb();
		x = test.getBulb();
		System.out.println(""+x);
	}
}
class BulbTest {
	public enum State {open, shut}
	State con;
	
	//构造方法：灯泡初始状态关闭
	public BulbTest() {
		con = State.shut;
	}
	
	//打开灯泡
	public void setBulb() {
		con = State.open;
	}
	
	//获取灯泡当前状态
	public State getBulb() {
		return con;
	}
}
