
//----------------------------------------------------------------------------------
//  @Classneme: Count_Six.java        Author: Kevin Mitnick
//  @Date: 2018年1月15日下午3:38:28
//  @Description: 利用PairOfDice类编写一个程序，掷一对骰子1000次，计算两个六点同时出现的次数
//----------------------------------------------------------------------------------
public class Count_Six 
{
	public static void main(String[] args)
	{
		final int limix = 1000;
		int count = 0, time = 1;
		int die1, die2;
		
		PairOfDice test = new PairOfDice();
		
		while (time <= limix)
		{
			test.roll();
			
			die1 = test.getFaceValve1();
			die2 = test.getFaceValue2();
			
			if (die1 == die2 && die1 == 6)
				count++;
			
			System.out.println(die1 + "   " + die2);
			System.out.println();
			time++;
		}
		
		System.out.println("两个六点同时出现的次数：" + count);
	}
}
