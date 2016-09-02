package java06;

public class FinalVariableTest {
	//定义成员变量时指定默认值吗，合法
	final int a=6;
	//下面变量将在构造器或初始化块中分配初始值
	final String str;
	final int c;
	final static double d;
	//既没有指定默认值，也没有在初始化块、构造器中指定初始值
	//下面定义的ch实例变量是不合法的
//	fianl char ch;
	//初始化块，可对没有指定默认值的实例变量指定初始值
	{
		//在初始化块中为实例变量指定初始值，合法
		str="Hello";
		//定义a实例变量时已经指定了默认值
		//不能为a重新赋值，因此下面赋值语句非法
//		a=9;
	}
	
	static{
		//在静态初始化块中为类变量指定初始值，合法
		d=5.6;
		//static修饰的初始化块是为类变量服务的
		//不能为成员变量赋值。下面语句非法
//		c=5;
	}
	
	//构造器，可对既没有指定默认值、有没有在初始化块中
	//指定初始值的实例变量指定初始值
	public FinalVariableTest(){
		//如果在初始化块中已经对str指定了初始化值
		//构造器中不能对final变量重新赋值
		//下面赋值语句非法
//		str="Java";
		//构造器不能为类变量赋值
//		d=5.6;
		c=5;
	}
	
	public void changeFinal(){
		//普通方法不能为final修饰的成员变量赋值
//		d=1.2;
		//不能在普通方法中为final成员变量指定初始值
//		ch='a';
	}
	
	public static void main(String[] args){
		FinalVariableTest ft=new FinalVariableTest();
		System.out.println(ft.a);
		System.out.println(ft.c);
		System.out.println(ft.d);
		System.out.println(ft.str);
	}
	
}
