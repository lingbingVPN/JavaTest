package java06;

public class OutputFieldTest {
	public static void main(String[] args){
		//访问另一个包中的Output接口的MAX_CACHE_LINE
		System.out.println(Output.MAX_CACHE_LINE);
		//下面语句将引起异常，原因是为final变量赋值
//		Output.MAX_CACHE_LINE=20;
		//使用接口来调用类方法
		System.out.println(Output.staticTest());
	}
}
