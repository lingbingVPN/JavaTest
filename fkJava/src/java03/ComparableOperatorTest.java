package java03;

public class ComparableOperatorTest {
	public static void main(String[] args){
		System.out.println("5�Ƿ����4.0:"+(5>4.0));
		System.out.println("5��5.0�Ƿ����:"+(5==5.0));
		System.out.println("97�Ƿ��'a'���:"+(97=='a'));
		System.out.println("true��false�Ƿ����:"+(true==false));
		//��������ComparableOperatorTest����ֱ���t1��t2
		ComparableOperatorTest t1=new ComparableOperatorTest();
		ComparableOperatorTest t2=new ComparableOperatorTest();
		
		//��������ComparableOperatorTestʵ�����ֱ���t1��t2
		//�������Ƚ�t1��t2�Ƿ���ͬһ������,�����ʾ����
		System.out.println(t1==t2);
		//t2��t3�������ڴ��ַ��һ���ģ�����������ͬһ�����󣬾���ͬһ���·��ϵ�������ǩ
		ComparableOperatorTest t3 = t2;
		System.out.println(t2==t3);
	}
}
