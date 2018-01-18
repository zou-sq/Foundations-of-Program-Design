//-------------------------------------------------------------------------------
//  @Classneme: Divisor.java        Author: Kevin Mitnick
//  @Date: 2018年1月17日上午12:21:50
//  @Description:  输入n个整数，依次输出每个整数的个数
//-------------------------------------------------------------------------------

import java.util.Scanner;

public class Divisor 
{
    public static void main(String[] args)
    {
        int N, num, count;
        Scanner scan = new Scanner(System.in);
        
        N = scan.nextInt();
        while (N != 0)
        {
            for (int i = 0; i < N; i++)
            {
                num = scan.nextInt();
                
                int j;
                count = 0;
                for (j =1; j < Math.sqrt(num); j++)
                    if (num % j == 0)
                        count += 2;
                
                if (j * j == num)
                	count++;
                else
                	count = 1;
                
                System.out.println(count);
                
            }
            
            N = scan.nextInt();
        }
        
        scan.close();
    }
}
