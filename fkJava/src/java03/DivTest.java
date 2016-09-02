package java03;

public class DivTest {
	public static void main(String[] args){
		double a=5.2;
		double b=3.1;
		double div=a/b;
		System.out.println(div);
		
		//输出正无穷大 Infinity
		System.out.println(5/0.0);
		
		//输出负无穷大 -Infinity
		System.out.println(-5/0.0);
		
		//下面将抛错，被除数不能为0的错误
		System.out.println(5/0);
	}
}
