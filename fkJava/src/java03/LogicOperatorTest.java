package java03;

public class LogicOperatorTest {
	public static void main(String[] args){
		//直接对false求非运算
		System.out.println(!false);
		System.out.println(5>3&&'6'>10);
		System.out.println(4>=5||'c'>'a');
		System.out.println(4>=5^'c'>'a');
		
		/**
		 * 如果是单逻辑运算，就不会短路，不管左边是否成立，右边的运算表达式
		 * 都会执行，如果是双逻辑运算，左边表达式成立之后就不会计算右边的表达说了
		 */
		//定义变量a,b并为两个变量赋值
		int a=5;
		int b=10;
		if(a>4|b++>10){
			System.out.println("a的值是:"+a+",b的值是:"+b);
		}
		
		//定义变量c,d，并为两个变量赋值
		int c=5;
		int d=10;
		if(c>4||d++>10){
			System.out.println("c的值是:"+c+",d的值是:"+d);
		}
	}
}
