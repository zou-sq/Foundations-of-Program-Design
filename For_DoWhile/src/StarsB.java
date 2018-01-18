//-------------------------------------------------------------------------------
//  @Classneme: StarsB.java        Author: Kevin Mitnick
//  @Date: 2018年1月15日下午8:05:35
//  @Description: 输出类似这样的一个三角形
// 											*		
//										   **
//										  ***
//										 ****
//										*****
//-------------------------------------------------------------------------------

public class StarsB 
{
	public static void main(String[] args)
	{
		final int row = 10, col = 10;
		for (int i = 1; i <= row; i++)
		{
			for (int j = i; j < col; j++)
				System.out.print(" ");
			
			for (int k = 1; k <= i; k++)
				System.out.print("*");
			
			System.out.println();
		}
	}

}
