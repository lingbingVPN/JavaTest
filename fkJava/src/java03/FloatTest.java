package java03;

public class FloatTest {
	public static void main(String[] args){
		float af = 5.2345556f;
		System.out.println(af);
		//af��ֵ���̶�����Ϊ������ֻ������֮�ڵ�һ�������ڣ�������ȷ�е����֡�
		double a = 0.0;
		double c = Double.NEGATIVE_INFINITY;
		float d = Float.NEGATIVE_INFINITY;
		//double��float�����������ȵ�
		System.out.println(c==d);
		//0.0����0.0�����ַ���NaN
		System.out.println(a/a);
		//��������֮���ǲ���ȵ�
		System.out.println(a/a==Float.NaN);
		//���е����������ȵ�
		System.out.println(6.0/0==887.0/0);
		//��������0.0�õ��������
		System.out.println(-8/a);
		//����Ĵ��뽫�׳�����0���쳣
//		System.out.println(5/0);
		//�����������ʱ֮����û���׳��쳣����Ϊ�����򱻳�����������һ���������͵���
		//�������͵�������һ������0��ֻ�����޽ӽ���0
		
	}
}
