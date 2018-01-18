//----------------------------------------------------------------------
//  @Classneme: RollingDice2.java        Author: Kevin Mitnick
//  @Date: 2018年1月11日下午2:29:0
//  @Description: 实例化并使用PairOfDice对象
//----------------------------------------------------------------------

public class RollingDice2 
{
	public static void main(String[] args)
	{
		PairOfDice pdice = new PairOfDice();
		int sum;
		
		pdice.setFaceValue1(3);
		pdice.setFaceValue2(5);
		sum = pdice.sum();
		System.out.println("两骰子之和："+sum);
		System.out.println();
		
		pdice.roll();
		
		int d1, d2;
		d1 = pdice.getFaceValve1();
		d2 = pdice.getFaceValue2();
		
		System.out.println("第一个骰子："+d1
				+"\n第二个骰子："+d2);
		sum = pdice.sum();
		System.out.println("两骰子之和："+sum);
	}
}

//PairOfDice类由两个Die对象组成
class PairOfDice
{
	Die die1, die2;
	
	//构造方法
	public PairOfDice() 
	{
		die1 = new Die();
		die2 = new Die();	
	}
	
	//设置骰子1
	public void setFaceValue1(int value) 
	{
		die1.setFaceValue(value);
	}
	
	//设置骰子2
	public void setFaceValue2(int value) 
	{
		die2.setFaceValue(value);
	}
	
	//获取骰子1
	public int getFaceValve1() 
	{
	    int value1;
		value1 = die1.getFaceValue();
		return value1;
	}
	
	//获取骰子2
	public int getFaceValue2()
	{
		int value2;
		value2 = die2.getFaceValue();
		return value2;
	}
	
	//一个掷骰子的方法
	public void roll()
	{
		die1.roll();
		die2.roll();
	}
	
	//返回当前两个骰子和值
	public int sum() 
	{
		int a, b;
		a = die1.getFaceValue();
		b = die2.getFaceValue();
		return a + b;
	}
}