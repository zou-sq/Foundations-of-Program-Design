//-------------------------------------------------------------------------------
//  @Classneme: TestStudent.java        Author: Kevin Mitnick
//  @Date: 2018年1月19日下午9:46:37
//  @Description:
//-------------------------------------------------------------------------------

public class TestStudent 
{
	public static void main(String[] args)
	{
		Student stu = new Student(60,90 ,60);
		
		System.out.println(stu.getTestScore(1));
		
		stu.setTestScore(3, 95);
		System.out.println(stu.Average());
		
		stu.Student();
		
		for (int i = 1; i <= 3; i++)
			System.out.println(stu.getTestScore(1));
	}
}
