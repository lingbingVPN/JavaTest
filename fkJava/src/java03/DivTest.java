package java03;

public class DivTest {
	public static void main(String[] args){
		double a=5.2;
		double b=3.1;
		double div=a/b;
		System.out.println(div);
		
		//���������� Infinity
		System.out.println(5/0.0);
		
		//���������� -Infinity
		System.out.println(-5/0.0);
		
		//���潫�״�����������Ϊ0�Ĵ���
		System.out.println(5/0);
	}
}
