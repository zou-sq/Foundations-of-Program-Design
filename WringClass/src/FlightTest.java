//--------------------------------------------------------------------
//  @Classneme: FlightTest.java        Author: Kevin Mitnick
//  @Date: 2018年1月11日下午2:10:50
//  @Description: 一个FlightTest驱动类，main方法实例化并返回一些Flight对象
//--------------------------------------------------------------------
public class FlightTest {
	public static void main(String[] args) {
		String str;
		Flight fli = new Flight();
		
		str = fli.toString();
		System.out.println(str);
	}
}
//一个代表航班的Flight类，其实例数据分别表示航线名、航班号及始发地和目的地城市名
class Flight{
	String airline, flightnum, start, destination;
	
	//构造方法：初始化实例数据
	public Flight() {
		airline = "美国东岸";
		flightnum = "CZ201819";
		start = "beijng";
		destination = "Los Angeles";
	}
	
	//返回一串描述该航班的字符串
	public String toString() {
		return airline+"\t"+flightnum+"\t"+start+"\t"+destination;
	}
}