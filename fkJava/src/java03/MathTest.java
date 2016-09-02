package java03;

public class MathTest {
	public static void main(String[] args){
		double a=3.2;
		//调用Math类的静态方法求a的5次方
		double b=Math.pow(a, 5);
		System.out.println(b);
		//求a的平方根
		double c=Math.sqrt(a);
		System.out.println(c);
		//获取一个0~1之间的随机数
		double d=Math.random();
		System.out.println(d);
		//求1.57的sin函数值
		double e=Math.sin(1.57);
		System.out.println(e);
		
	}
}
