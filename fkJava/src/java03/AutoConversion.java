package java03;

public class AutoConversion {
	public static void mian(String[] args){
		int a = 6;
		//int可以自动转换位float类型
		float f = a;
		System.out.println(f);
		//定义一个byte类型的整数变量
		byte b =9;
		//下面代码将出错，byte类型不能自动转换成char类型
		char c = (char)b;
		//改进后用强制类型转换
		System.out.println(c);
		
		//下面是byte类型变量可以自动转换为double类型
		double d = b;
		System.out.println(d);
	}
}
