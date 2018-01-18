//------------------------------------------------------------
//  @Classneme: Pig.java        Author: Kevin Mitnick
//  @Date: 2018年1月12日下午4:07:27
//  @Description: Pig游戏，游戏是计算机与用户进行比赛
//------------------------------------------------------------

import java.util.Scanner;

public class Pig 
{
	public static void main(String[] args) 
	{
		int comPoint1, comPoint2, manPoint1, manPoint2;     //电脑和玩家各两个骰子
		int sumCom = 0, sumMan = 0;                         //电脑和玩家骰子总和
		int perround1 = 0, perround2 = 0;                   //记录每一轮点数总和
		
		PairOfDice piggame = new PairOfDice();
		int manChoice = 1;
		Scanner scan = new Scanner(System.in);
		
		while (sumCom < 100 && sumMan < 100)
		{
			piggame.roll();               //玩家掷骰子
			manPoint1 = piggame.getFaceValve1();
			manPoint2 = piggame.getFaceValue2();
			System.out.println("玩家掷的两个骰子点数为： "+ manPoint1 + "  "+ manPoint2);
			
			if (manPoint1 == 1 && manPoint2 == 1)
			{
				sumMan = 0;
				manChoice = 2;
			}
			else if (manPoint1 == 1 || manPoint2 == 1)
			{
				perround1 = 0;
				manChoice =2;
			}
			else
			{
				perround1 += piggame.sum();          //计算两骰子之和并加到该轮点数上
				
				//若此时玩家点数已经达到一百甚至超过一百，则玩家赢了，没有进行下去的必要了
				if(sumMan + perround1 >= 100)
				{
					System.out.println("恭喜玩家获胜！！");
					sumMan += perround1;
					break;
				}
				
				System.out.println();
				System.out.println("你还要继续掷骰子吗？（1继续，2给电脑）：");
				manChoice = scan.nextInt();
			}			
			if (manChoice == 2)
			{
				sumMan += perround1;
				System.out.println("玩家此轮点数之和为：" + perround1);
				System.out.println("玩家总的点数之和为：" + sumMan);
				System.out.println();
				perround1 = 0;                                        //每轮点数归零
				
				while (perround2 <= 20)
				{
					int time = 0;                           //记录电脑每轮掷骰子次数
					
					piggame.roll();                                   //电脑掷骰子
					time++;
					comPoint1 = piggame.getFaceValve1();
					comPoint2 = piggame.getFaceValue2();
					
					System.out.println("电脑此轮第"+ time +"次掷的两个骰子点数为： " + comPoint1 +"  "+ comPoint2);
					
					if (comPoint1 == 1 && comPoint2 ==1)
					{
						sumCom = 0;
						perround2 =0;
						break;
					}
					else if (comPoint1 == 1 || comPoint2 == 1)
					{
						perround2 = 0;
						break;
					}
					else
						perround2 += piggame.sum();
				}
				
				sumCom += perround2;
				
				System.out.println();
				System.out.println("电脑此轮点数总和为：" + perround2);
				System.out.println("电脑总的点数之和为：" + sumCom);
				
				perround2 =0;                       //每轮点数归零
			}
		}//while
		
		System.out.println();
		if (sumMan >= 100)
			System.out.println("恭喜玩家赢了！");
		else
			System.out.println("恭喜电脑赢了！");
		
		scan.close();
	} 
}
