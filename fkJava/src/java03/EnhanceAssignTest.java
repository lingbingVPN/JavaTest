package java03;

public class EnhanceAssignTest {
	public static void main(String[] args){
		//定义一个byte类型的变量
		byte a=5;
//		a = a+5;
		//5默认是int类型的，a+5之后得到的值是int类型
		//再赋予byte类型的话就会溢出报错
		byte b=5;
		b +=5;
		
		//为什么第一个有错，第二个正确？
	}
}
