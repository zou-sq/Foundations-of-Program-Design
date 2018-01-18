//-------------------------------------------------------------------------------
//  @Classneme: Multi_12.java        Author: Kevin Mitnick
//  @Date: 2018年1月14日下午9:48:08
//  @Description:  输出一个12*12乘法表
//-------------------------------------------------------------------------------

public class Multi_12 
{
	public static void main(String[] args)
	{
		final int NUM = 12;
		
		for (int i = 1; i <= NUM; i++)
		{
			for (int j =1; j <= i; j++)
			{
				if (i <= 9)
					System.out.print(i + "*"+ j + "="+ i*j + "    ");
				else
					System.out.print(i + "*"+ j + "="+ i*j + "  ");
			}
			System.out.println();
		}
	}

}
