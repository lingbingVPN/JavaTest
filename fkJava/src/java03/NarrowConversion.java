package java03;

public class NarrowConversion {
	public static void main(String[] args){
		int iValue=233;
		//ǿ�ư�һ��int���͵�ֵת��Ϊbyte���͵�ֵ
		byte bValue=(byte) iValue;
		//��Ϊ��������������-23
		System.out.println(bValue);
		
		double dValue = 3.98;
		//ǿ�ư�һ��double���͵�ֵת��Ϊint
		int tol=(int)dValue;
		//������ת��������ֱ�ӰѸ�����С�������е�������������������
		System.out.println(tol);
	}
}
