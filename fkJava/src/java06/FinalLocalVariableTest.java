package java06;

public class FinalLocalVariableTest {
	public void test(final int a){
		//不能对final修饰的形参赋值，下面语句非法
//		a=6;
	}
	
	public static void main(String[] args){
		//定义final局部变量时指定默认值，则str变量无法重新赋值
		final String str="Hello";
		//下面企图修改final修饰的局部变量的初始值，将出错
//		str="no!no!no!";
		//定义final局部变量时没有指定默认值，则可以被赋值一次
		final double d;
		//第一次给final修饰的变量赋值，不会错误
		d=5.67;
		//下面对final变量重复赋值，将出错
//		d=445.66;
		
		}
}
