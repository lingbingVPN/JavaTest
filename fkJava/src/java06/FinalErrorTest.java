package java06;

public class FinalErrorTest {
	//定义一个final修饰的实例变量
	//系统不会对final成员变量进行默认初始化
	final int age;
	{
		//age没有初始化，下面代码将出错
//		System.out.print(age);
		age=6;
		System.out.println(age);
	}
	
	public static void main(String[] args){
		new FinalErrorTest();
	}
}
