package java06;

public class FinalLocalVariableTest {
	public void test(final int a){
		//���ܶ�final���ε��βθ�ֵ���������Ƿ�
//		a=6;
	}
	
	public static void main(String[] args){
		//����final�ֲ�����ʱָ��Ĭ��ֵ����str�����޷����¸�ֵ
		final String str="Hello";
		//������ͼ�޸�final���εľֲ������ĳ�ʼֵ��������
//		str="no!no!no!";
		//����final�ֲ�����ʱû��ָ��Ĭ��ֵ������Ա���ֵһ��
		final double d;
		//��һ�θ�final���εı�����ֵ���������
		d=5.67;
		//�����final�����ظ���ֵ��������
//		d=445.66;
		
		}
}
