//------------------------------------------------------------
//  @Classneme: Bookshelf.java        Author: Kevin Mitnick
//  @Date: 2018年1月11日下午1:42:10
//  @Description: Bookshelf类，main方法实例化并返回一些Book对象
//------------------------------------------------------------
public class Bookshelf {
	public static void main(String[] args) {
		Book book1 = new Book("老子政治哲学", "叶自成", "上海财经大学出版社", 201708);
		Book book2 = new Book("爱因斯坦全传", "金泽灿", "华中科技大学出版社", 201709);
		Book book3 = new Book("Java程序设计教程", "电子工业出版社", "John Lewis、William Loftus", 201507);
		
		String str1, str2, str3;
		str1 = book1.toString();
		str2 = book2.toString();
		str3 = book3.toString();
		
		System.out.println(str1);
		System.out.println();
		System.out.println(str2);
		System.out.println();
		System.out.println(str3);
	}
}

//Book类，其实例数据分别表示书名、作者、出版社及版权日期
class Book{
	String bookname, writer, publish;
	long date;
	
	//构造方法：接收并初始化实例数据
	public Book(String bname, String wri, String pub, long dat){
		bookname = bname;
		writer = wri;
		publish = pub;
		date = dat;
	}
	
	//返回几行描述该书的字符串
	public String toString() {
		return "书的名字："+bookname
				+"\n作者："+writer
				+"\n出版社："+publish
				+"\n出版日期："+date;		
	}
}