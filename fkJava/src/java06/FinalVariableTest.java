package java06;

public class FinalVariableTest {
	//�����Ա����ʱָ��Ĭ��ֵ�𣬺Ϸ�
	final int a=6;
	//����������ڹ��������ʼ�����з����ʼֵ
	final String str;
	final int c;
	final static double d;
	//��û��ָ��Ĭ��ֵ��Ҳû���ڳ�ʼ���顢��������ָ����ʼֵ
	//���涨���chʵ�������ǲ��Ϸ���
//	fianl char ch;
	//��ʼ���飬�ɶ�û��ָ��Ĭ��ֵ��ʵ������ָ����ʼֵ
	{
		//�ڳ�ʼ������Ϊʵ������ָ����ʼֵ���Ϸ�
		str="Hello";
		//����aʵ������ʱ�Ѿ�ָ����Ĭ��ֵ
		//����Ϊa���¸�ֵ��������渳ֵ���Ƿ�
//		a=9;
	}
	
	static{
		//�ھ�̬��ʼ������Ϊ�����ָ����ʼֵ���Ϸ�
		d=5.6;
		//static���εĳ�ʼ������Ϊ����������
		//����Ϊ��Ա������ֵ���������Ƿ�
//		c=5;
	}
	
	//���������ɶԼ�û��ָ��Ĭ��ֵ����û���ڳ�ʼ������
	//ָ����ʼֵ��ʵ������ָ����ʼֵ
	public FinalVariableTest(){
		//����ڳ�ʼ�������Ѿ���strָ���˳�ʼ��ֵ
		//�������в��ܶ�final�������¸�ֵ
		//���渳ֵ���Ƿ�
//		str="Java";
		//����������Ϊ�������ֵ
//		d=5.6;
		c=5;
	}
	
	public void changeFinal(){
		//��ͨ��������Ϊfinal���εĳ�Ա������ֵ
//		d=1.2;
		//��������ͨ������Ϊfinal��Ա����ָ����ʼֵ
//		ch='a';
	}
	
	public static void main(String[] args){
		FinalVariableTest ft=new FinalVariableTest();
		System.out.println(ft.a);
		System.out.println(ft.c);
		System.out.println(ft.d);
		System.out.println(ft.str);
	}
	
}
