package java05;

import java.sql.SQLNonTransientConnectionException;

public class Overload {
	//下面定义了两个test()方法，但方法的形参列表不同
	//系统可以区分这两个方法，这种被称为方法重载
	public void test(){
		System.out.println("无参数");
	}
	public void test(String msg){
		System.out.println("重载的test方法"+msg);
	}
	
	public static void main(String[] args){
		Overload o1=new Overload();
		//第一次调用test()时没有传入参数，因此系统调用上面没有参数的test()方法
		o1.test();
		//第二次调用test(String msg)时
		//传入了一个String类型的字符串参数
		//因此系统调用上面带一个字符串参数的test(String msg)方法
		o1.test("hello,这是第二个有参数的重载方法");
	}
}
