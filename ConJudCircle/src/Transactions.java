//------------------------------------------------------------------------------
//  @Classname: Transactions.java                @Author: Kevin Mitnick
//  @Date: 2018年1月12日下午3:11:07
//  @Description: 建立几个Account对象并调用这些对象的服务
//------------------------------------------------------------------------------

import java.text.NumberFormat;

public class Transactions 
{
	public static void main(String[] args) 
	{
		Account acct1 = new Account("Ted Murphy", 72354, 102.56);
		Account acct2 = new Account("Jane Smith", 69713, 40.00);
		Account acct3 = new Account("Edward Demsey", 93757, 759.32);
		
		acct1.deposit(-25.85);
		
		double smithBalance = acct2.deposit(500.00);
		System.out.println("Smith balance after deposit: " + smithBalance);
		
		
		System.out.println("Smith balance after withdrawal: " + acct2.withdraw(430.75,  1.50));
		
		acct1.addInterest();
		acct2.addInterest();
		acct3.addInterest();
		
		System.out.println();
		
		System.out.println(acct1);    //等价于 System.out.println(acct1.toString());
		System.out.println(acct2);    //等价于 System.out.println(acct2.toString());
		System.out.println(acct3);    //等价于 System.out.println(acct3.toString());
		//对上面三个输出的解释：每当Xxx对象传递给print方法或println方法时，将自动调用
		//toString方法，以获得被输出对象的字符串描述。因此对于大多数类而言，一般最好定义
		//一个toString方法。
	}
}

//Account类代表一个基本的银行的基本账户，实例数据包括账号、当前余额、账户姓名

class Account
{
	private final double RATE = 0.035;   // 利率
	
	private long acctNumber;
	private double balance;
	private String name;
	
	//构造方法：设置账户的姓名、账户和账号
	public Account(String ower, long account, double initial)
	{
		name = ower;
		acctNumber = account;
		balance = initial;
	}
	
	//存款并返回新的余额
	public double deposit(double amount)
	{
		if (amount < 0)
			System.out.println("请输入正确的存款值！！！");
		else
			balance = balance + amount;
			return balance;
	}
	
	//取款并返回新的余额
	public double withdraw(double amount, double fee)
	{
		if (amount > balance)
			System.out.println("取款超过当前余额了！！！");
		else
			balance = balance - amount -fee;
		
		return balance;
	}
	
	//账户添加利息并返回新的余额
	public double addInterest()
	{
		balance += (balance *RATE);
		return balance;
	}
	
	//返回当前余额
	public double getBalance()
	{
		return balance;
	}
	
	//返回一个描述该账户的字符串
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return acctNumber + "\t" + name + "\t" + fmt.format(balance);
	}
}