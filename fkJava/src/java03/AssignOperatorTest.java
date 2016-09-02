package java03;

public class AssignOperatorTest {
	public static void main(String[] args){
		String string="Java";
		double pi=3.14;
		boolean visited=true;
		String string2=string;
		int a;
		int b;
		int c;
		//通过为a,b,c赋值，三个变量的值都是7
		a=b=c=7;
		//输出三个变量的值
		System.out.println(a+"\n"+b+"\n"+c);
		
		double d1=12.34;
		double d2=d1+5;
		System.out.println(d2);
	}
}
