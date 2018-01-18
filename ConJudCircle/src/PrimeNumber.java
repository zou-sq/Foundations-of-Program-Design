//------------------------------------------------------------------------------
//  @Classname: PrimeNumber.java                @Author: Kevin Mitnick
//  @Date: 2018年1月12日下午12:16:57
//  @Description: 输出100以内的素数
//------------------------------------------------------------------------------

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 3, i = 2;
		boolean isPrimeNumber = true;
		
		System.out.println("2是素数。");
		
		while (n < 100000) {
			while (i < n) {
				if (n % i == 0)
					isPrimeNumber = false;
				
				i++;
			}
			
			if (isPrimeNumber == true)
				System.out.println(n + "是素数。");
			isPrimeNumber = true;
			i = 2;
			n++;
		}
	}
}
