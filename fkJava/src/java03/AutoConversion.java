package java03;

public class AutoConversion {
	public static void mian(String[] args){
		int a = 6;
		//int�����Զ�ת��λfloat����
		float f = a;
		System.out.println(f);
		//����һ��byte���͵���������
		byte b =9;
		//������뽫����byte���Ͳ����Զ�ת����char����
		char c = (char)b;
		//�Ľ�����ǿ������ת��
		System.out.println(c);
		
		//������byte���ͱ��������Զ�ת��Ϊdouble����
		double d = b;
		System.out.println(d);
	}
}
