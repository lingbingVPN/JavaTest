package java06;

public class UnsignedTest {
	public static void main(String[] args){
		byte b=-3;
		//��byte���͵�-3ת��Ϊ�޷�����˰
		System.out.println(Byte.toUnsignedInt(b));
		//ָ��ʹ��16���ƽ����޷���֤��
		int val=Integer.parseUnsignedInt("ab",16);
		System.out.println(val);
		//��-12ת��Ϊ�޷���int�ͣ�Ȼ��ת��Ϊ16���Ƶ��ַ���
		System.out.println(Integer.toUnsignedString(-12, 16));
		//��������ת��Ϊ�޷������������
		System.out.println(Integer.divideUnsigned(-2, 3));
		//��������ת��Ϊ�޷��������ദ������
		System.out.println(Integer.remainderUnsigned(-2, 7));
	}
}
