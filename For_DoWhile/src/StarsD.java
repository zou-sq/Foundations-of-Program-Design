//-------------------------------------------------------------------------------
//  @Classneme: Starsd.java        Author: Kevin Mitnick
//  @Date: 2018年1月15日下午8:24:20
//  @Description: 输出类似这样的图形
//									  *
//									 ***
//									*****
//									*****
//									 ***
//									  *
//-------------------------------------------------------------------------------

//此程序还有一个更好的解法，在本项目StarsD_Pro程序中，我没想出来，是参考另一本书上的。

public class StarsD
{
	public static void main(String[] args)
	{
		final int row = 10;  // 通过修改这个数可以改变整个图形的大小，从而不必修改代码中每一个变量
		
		for (int i = 1; i <= row; i++)
		{
			for (int j = i; j < row; j++)
				System.out.print(" ");
			
			for (int k = 1; k <= 2 * i - 1; k++)
				System.out.print("*");
			
			System.out.println();
		}
		
		for ( int i = 1; i <= row; i++)
		{
			for (int j = row - i; j < row - 1; j++)
				System.out.print(" ");
			
			for (int k =1; k <= 2 * (row - i) + 1; k++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}
