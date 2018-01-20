import java.util.Scanner;
 
public class Test 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) 
        {
            String string = scanner.nextLine();
            char[] ch = string.toCharArray();
            int number = 0, count = 0, number2 = 0;
            for (int i = 0; i < ch.length; i++) 
            {
                number = ch[i] - 97;
                if (i == ch.length - 1)
                {
                    number2 = 100;
                } else 
                {
                    number2 = ch[i + 1] - 97;
                }
                if (number < 15) 
                {
                    if (Math.abs(number2 - number) < 3 && (number / 3 - number2 / 3 == 0)) 
                    {
                        count += 2;
                    }
                    number = number % 3 + 1;
                } 
                else if (number < 19) 
                {
                    if (number2 < 19 && number2 > 14) 
                    {
                        count += 2;
                    }
                    number = number - 14;
                } 
                else if (number < 22) 
                {
                    if (number2 < 22 && number2 > 18)
                    {
                        count += 2;
                    }
                    number = number - 18;
                } 
                else 
                {
                    if (number2 < 26 && number2 > 21) 
                    {
                        count += 2;
                    }
                    number = number - 21;
                }
                count += number;
            }
            System.out.println(count);
        }
    }
}