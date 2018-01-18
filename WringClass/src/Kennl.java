//------------------------------------------------------------
//  @Classneme: Kennl.java        Author: Kevin Mitnick
//  @Date: 2018年1月10日下午8:05:18
//  @Description: 一个Kennl驱动类，其main方法实例化并返回一些Dog对象
//------------------------------------------------------------
public class Kennl {
	public static void main(String[] args) {
		Dog dog1, dog2;
		String name1, name2;
		int age1, manage1;
		String str;
		
		dog1 = new Dog("Kevin", 3);
		dog2 = new Dog("Mitnick", 4);
		
		name1 = dog1.getDogName();
		name2 = dog2.getDogName();
		age1 = dog1.getDogAge();
		manage1 = dog1.getEquivalManAge();
		str = dog1.toString(name1, age1, manage1);	
		System.out.println(str);
		System.out.println("二狗的名字是："+name2);
	}
}

//Dog类，实例数据表示狗的名字和年龄
class Dog{
	private String dogname;
	private int dogage;
	
	//构造方法，接收并初始化这些数据
	public Dog(String name, int age) {
		dogname = name;
		dogage = age;
	}
	
	//设置狗的名字
	public void setName(String str) {
		dogname = str;
	}
	
	//设置狗的年龄
	public void setAge(int age) {
		dogage = age;
	}
	
	//获取狗的名字
	public String getDogName() {
		String str = dogname;
		return str;
	}
	
	//获取狗的年龄
	public int getDogAge() {
		int age = dogage;
		return age;
	}
	
	//计算并返回狗等效于人的年龄
	public int getEquivalManAge() {
		int equivalmanage = dogage * 7;
		return equivalmanage;
	}
	
	//返回一行描述狗的字符串
	public String toString(String dogname, int dogage, int manage) {
		String str = "我是一只疯狗，我的名字叫"+dogname
				+"，我今年"+dogage+"岁了。\n这相当于人类年龄"+manage+"岁，你们喜欢我吗？";
		return str;		
	}
}