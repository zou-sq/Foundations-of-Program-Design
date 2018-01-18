//-------------------------------------------------------------------------------
//  @Classneme: StarsC.java        Author: Kevin Mitnick
//  @Date: 2018年1月15日下午8:17:53
//  @Description: 输出类似这样的三角形
//									*****
//									 ****
//									  ***
//									   **
//										*
//-------------------------------------------------------------------------------

public class StarsC 
{
	public static void main(String[] args)
	{
		final int row = 10, col = 10;
		
		for (int i = 1; i <= row; i++)
		{
			for (int j = row - i; j < row; j++)
				System.out.print(" ");
			
			for (int k = i; k <= col; k++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}
