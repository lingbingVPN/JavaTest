package java03;

public class MathTest {
	public static void main(String[] args){
		double a=3.2;
		//����Math��ľ�̬������a��5�η�
		double b=Math.pow(a, 5);
		System.out.println(b);
		//��a��ƽ����
		double c=Math.sqrt(a);
		System.out.println(c);
		//��ȡһ��0~1֮��������
		double d=Math.random();
		System.out.println(d);
		//��1.57��sin����ֵ
		double e=Math.sin(1.57);
		System.out.println(e);
		
	}
}
