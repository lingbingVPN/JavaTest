package java06;

public class AccessStaticInnerClass {
	static class StaticInnerClass{
		private static int prop1=5;
		private int prop2=9;
	}
	
	public void accessInnerProp(){
		//prop1 cannot be resolved to a variable
		//�����ڲ�������Աʱ��Ӧ�����ڲ�����������
//		System.out.println(prop1);
		//��ȷʾ��
		System.out.println(StaticInnerClass.prop1);
		//�����ڲ�����ͨ��Աʱ��Ӧͨ���ڲ����ʵ��������
//		System.out.println(prop2);
		//��ȷʾ��
		System.out.println(new StaticInnerClass().prop2);
		
	}
}
