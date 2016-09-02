package java03;

public class primitiveAndString {
	public static void main(String[] args){
		//下面代码将报错，因为5是一个整数，不能直接赋给一个字符串
		String str1="5";
		//如果要将数值变成字符串，要么用加法拼接，要么用双引号
		//下面就是用一个浮点数加一个空格来实现拼接成字符串
		String str2=3.5f+"";
		
		//下面的代码先做数值运算，然后再用加法将数值与字符串拼接成新的字符串
		System.out.println(3+4+"Hello!");
		//下面先做字符串拼接，然后再把4也拼接起来
		System.out.println("Hello!"+3+4);
	}
}
