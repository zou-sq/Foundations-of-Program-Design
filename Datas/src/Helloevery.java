//输入个人信息然后自动打印出一段自我介绍
import java.util.Scanner;
public class Helloevery {
	public static void main(String[] args)
	{
		String name, school, petname;
		int age;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请依次输入你的姓名、年龄、毕业院校、宠物名字：");
		name = scan.next();
		age = scan.nextInt();
		school = scan.next();
		petname = scan.next();
		
		System.out.println("Hello, my name is "+name+" and I am "+age+" years"
				+"\rold.I'm enjoying my time at "+school+", though"
				+"\rI miss my pet "+petname+" very much!");
	}
	

}
