//------------------------------------------------------------------------------
//  @Classname: CountFlips.java                @Author: Kevin Mitnick
//  @Date: 2018年1月15日下午3:58:25
//  @Description: 利用Coin类编写的CountFlips程序，其main方法将硬币抛100次，
//                然后输出每一面朝上的次数
//------------------------------------------------------------------------------

public class CountFlips
{
	public static void main(String[] args)
	{
		int head = 0, tail = 0;
		Coin coin = new Coin();
		
		for (int i = 1; i <= 100; i++)
		{
			coin.flip();
			
			if (coin.isHEADS())
				head++;
			else
				tail++;
		}
		
		System.out.println("正面朝上次数：" + head);
		System.out.println("反面朝上次数：" + tail);
	}
}
