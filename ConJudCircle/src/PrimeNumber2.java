//使用for循环找出100以内的素数
public class PrimeNumber2 {
	public static void main(String[] args)
	{
		boolean isSushu = true;
		
		for (int i = 2; i <= 100; i++)
		{
			for (int n = 2; n < i; n++)
			{
				if (i % n == 0 && i != 2)
					isSushu = false;
			}
			
			if (isSushu == true)
				System.out.println(i + "是素数。");
			
			isSushu = true;
		}
	}

}
