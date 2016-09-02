package java05;

public class MethodLocalVariableTest {
	public static void main(String[] args){
		//定义一个方法局部变量a
		int a;
		//下面的代码将出错，因为不管是代码块局部变量还是方法局部变量
		//局部变量是不会自动初始化的，不初始化就不能访问
//		System.out.println(a);
		//下面为a变量初始化
		a=5;
		System.out.println("初始化之后可以正常访问了,a的值是:"+a);
	}
}
