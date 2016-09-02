package java06;

public class StaticTest {
	//定义一个非静态的内部类，是一个空类
	private class In{}
	//外部类的静态方法
	public static void main(String[] args){
		//下面代码引发编译异常，因为静态成员
		//无法访问非静态成员
//		new In();
	}
}
