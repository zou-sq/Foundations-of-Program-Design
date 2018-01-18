//-------------------------------------------------------------------------------
//  @Classneme: StarsD_Pro.java        Author: Kevin Mitnick
//  @Date: 2018年1月15日下午9:00:52
//  @Description: 采用一种更好的算法实现StarsD中的图形，参考了另一本书
//-------------------------------------------------------------------------------

public class StarsD_Pro 
{
	public static void main(String[] args)
	{
		int n = 18;
		int o = n / 2;
		int t = 1;
		int step = 2;
		for (int i= 0; i < n; i++)
		{
			for (int j = 1; j < Math.abs(o); j++)   //Math.abs()输出绝对值
				System.out.print((char) 32);
			
			o--;           //下一次循环比这次少输出一个空格，为负之后多输出一个空格
			
			//输出t个星
			for (int k = 1; k <= t; k++)
				System.out.print("*");
			
			t = t + step;     //下一个循环比这次多输出两个星
			
			if (t == n + 1)
			{
				//System.out.println();
				
				//for (int m = 1; m <= t; m++)
					//System.out.print("*");
				t = t -step;
				o--;
				//o = o - 2;   //o从1到-1，控制下面倒三角形的输出
				step = - step;    //下一次循环比这次少输出两个星
			}
			System.out.println();
		}
	}
}
// 看完之后感觉这个程序比我那个好不哪去，可能思维是好的，但是我还没有体会到
// 而且这个跟我那个输出的图形有一点差别，如果将本程序的n改为偶数将会输出另一种图形
// n仍为奇数还是一个菱形.......已将程序做了修改，输出图形与StarsD相同
