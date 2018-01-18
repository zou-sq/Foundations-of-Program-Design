//------------------------------------------------------------------------------
//  @Classname: FlipRace.java                @Author: Kevin Mitnick
//  @Date: 2018年1月11日下午9:48:29
//  @Description: 利用Coin类设计并实现一个驱动类FlipRace，该类main方法创建两个coin对象,
//                不停地抛起这两枚硬币，看哪枚硬币连续三次正面朝上，首先完成者为胜。此程序还
//                考虑两者不分胜负的可能性。
//------------------------------------------------------------------------------

public class FlipRace {
	public static void main(String[] args) {
		int frequency1 = 0, frequency2 = 0;               //记录硬币抛掷的总次数
		Coin coin1, coin2;                       //两个Coin对象
		int time1 = 0, time2 = 0;                //记录连续抛出正面的次数
		String str;                             
		
		coin1 = new Coin();
		coin2 = new Coin();
		
		while (time1 != 3 && time2 != 3 && frequency1 <= 15) {
			coin1.flip();
			if (coin1.isHEADS())
				time1++;
			else 
				time1 = 0;
			frequency1++;
			str = coin1.toString();
			System.out.print("coin1第"+frequency1+"次："+str);
			
			coin2.flip();
			if (coin2.isHEADS())
				time2++;
			else
				time2 = 0;
			frequency2++;
			str = coin2.toString();
			System.out.println("\t\tcoin2第"+frequency2+"次："+str);
		} //while
		
		System.out.println();
		
		if (frequency1 > 15)
			System.out.println("两者不分胜负。");
		else if (time1 == 3)
			System.out.println("恭喜coin1赢了！！！");
		else
			System.out.println("恭喜coin2赢了！！！");
		
	}
}

// 定义Coin类
class Coin{
	private final int HEADS = 0;
	
	private int face;
	
	//构造方法：抛掷硬币获得第一次结果
	public Coin() {
		flip();
	}
	
	//实现硬币抛掷过程
	public void flip() {
		face = (int) (Math.random() * 2);
	}
	
	//若硬币正面朝上，返回true，否则返回false
	public boolean isHEADS() {
		return (face == HEADS);
	}
	
	//以字符串形式返回硬币当前状态
	public String toString() {
		String faceName;
		if (face == HEADS)
			faceName = "Heads";
		else
			faceName = "Tails";
		
		return faceName;
	}
}




















