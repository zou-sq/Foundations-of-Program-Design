//输入一个代表总钱数的双精度值，然后确定每种纸币和硬币需要的最少数量以达到输入的总钱数
import java.util.Scanner;
public class MoneyConverter {
	public static void main(String[] args)
	{
		int tendb, fivdb, onedb, quarter, dime, nickle, penny;
		//quarter是25美分，dime是一角即十美分，nickle是五美分，penny时一美分
		double money, moneysmall;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入双精度的总钱数：");
		money = scan.nextDouble();
		
		tendb = (int)money/10;
		fivdb = (int)(money - tendb*10)/5;
		onedb = (int)(money - tendb*10 - fivdb*5);
		moneysmall = (int) ((money - (tendb*10 + fivdb*5+onedb))*100);
		quarter = (int) (moneysmall/25);
		dime = (int) (moneysmall - quarter*25)/10;
		nickle = (int) (moneysmall - quarter*25 -dime*10)/5;
		penny = (int) (moneysmall - quarter*25 - dime*10 - nickle*5);
		
		System.out.println(tendb+" ten dollars bills\r"
				+fivdb+" five dollars bills\r"
				+onedb+" one dollars bills\r"
				+quarter+" quarters\r"
				+dime+" dimes\r"
				+nickle+" nickles\r"
				+penny+" pennies");
				
		scan.close();
		
	}

}