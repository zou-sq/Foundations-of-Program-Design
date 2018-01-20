//-------------------------------------------------------------------------------
//  @Classneme: Student.java        Author: Kevin Mitnick
//  @Date: 2018年1月19日下午9:22:19
//  @Description:    对章节中的Student类做了修改
//-------------------------------------------------------------------------------

public class Student 
{
	private int score1, score2, score3;
	
	//构造方法：根据参数值设置所有实例值
	public Student(int mark1, int mark2, int mark3)
	{
		score1 = mark1;
		score2 = mark2;
		score3 = mark3;
	}
	
	//重载构造方法：是的每一次考试成绩都初始化为零
	public void Student()
	{
		score1 = 0;
		score2 = 0;
		score3 = 0;
	}
	
	//设置某门考试成绩，两个参数，考试编号（1~3）和分数
	public void setTestScore(int i, int score)
	{
		switch (i){
		case 1:
			score1 = score;
			break;
		case 2:
			score2 = score;
			break;
		case 3:
			score3 = score;
			break;
		default:
			;
		}
	}
	
	//获取某门考试成绩，一个参数，考试编号（1~3）
	public int getTestScore(int i)
	{
		int score = 0;
		switch (i){
		case 1:
			score = score1;
			break;
		case 2:
			score = score2;
			break;
		case 3:
			score = score3;
			break;
		default:
			score = 0;
				
		}
		return score;
	}
	
	//计算并返回该学生三次考试的平均成绩
	public int Average()
	{
		int average;
		average = (score1 + score2 + score3)/3;
		return average;
	}
}


















