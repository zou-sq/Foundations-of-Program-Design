//-------------------------------------------------------------------------------
//  @Classneme: StarsA.java        Author: Kevin Mitnick
//  @Date: 2018年1月15日下午4:06:28
//  @Description: 输出类似这样的一个三角形
//				     				******
//				               		*****	
//			  		  				***
//									**
//									*
//-------------------------------------------------------------------------------

public class StarsA 
{
	public static void main(String[] args)
	{
		final int row = 10;                //总共有多少行星星
		final int col = 10;                //第一行星星的个数
		for (int i = 1; i <= row; i++)
		{
			for (int j = i; j <= col; j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}
