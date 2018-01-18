//----------------------------------------------------------------
//  @Classneme: CounterTest.java        Author: Kevin Mitnick 
//  @Date: 2018年1月10日下午4:19:51
//  @Description:创建一个CounterTest驱动类，创建两个对象并测试这些方法
//----------------------------------------------------------------
public class CounterTest {
	public static void main(String[] args) {
		Counter counter1, counter2;
		int num1, num2;
		
		counter1 = new Counter();
		counter2 = new Counter();
		
		counter1.click();
		num1 = counter1.getCount();
		
		System.out.println("num1= "+num1);
		
		while(num1 < 10) {
			counter2.click();
			num1++;
		}
		num2 = counter2.getCount();
		
		System.out.println("num2= "+num2);
		System.out.println("现在将num1和num2的设置为0");
		
		counter1.reset();
		counter2.reset();
		System.out.println(" "+counter1.getCount()+" "+counter2.getCount());
	}
}
class Counter{
	private int count;
	
	//构造方法：将计数值初始化为0
	public Counter() {
		count = 0;
	}
	
	//将计数值增加1
	public void click() {
		count++;
	}
	
	//返回当前的计数值
	public int getCount() {
		return count;
	}
	
	//将计数值重新设置为0
	public void reset() {
		count = 0;
	}
}