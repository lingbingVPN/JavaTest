package java03;

public class IntegerValTest {
	public static void main(String[] args){
		//�����������ȷ�ģ�ϵͳ���Զ���56����byte���ʹ���
		byte a =56;
		System.out.println(a);
		
		/*
		 * ��������Ǵ���ģ�ϵͳ�����9999999999999999����long�ʹ���
		 * ��Ϊ����int�ı�����Χ���Ӷ��������
		 */
//		long bigValue=99999999999999999;
		
		/*
		 * �����������ȷ�ģ��ھ޴������ֵ��ʹ��L��׺��ǿ��ʹ��long����
		 */
		
		long bigValue2=1233246758326457L;
		
		//��0��ͷ������ֵ�ǰ˽��Ƶ�����
		int octaValue=013;
		System.out.println(octaValue);//���11
		
		//��0x��0X��ͷ������ֵ��ʮ�����Ƶ�����
		int hexValue1=0x13;
		System.out.println(hexValue1);
		int hexValue2=0XaF;
		System.out.println(hexValue2);
		
		//��������8λ�Ķ���������
		int binVal1 = 0b11010100;
		byte binVal2=0B01101001;
		//����һ��32λ�Ķ��������������λ�Ƿ���λ
		//���»��߽����ָ���ʱ���ñ�֤�»������߶�������
		int binVal3 = 0B1000_0000_0000_0000_0000_0000_0000_0011;
		
		System.out.println(binVal1);
		System.out.println(binVal2);
		System.out.println(binVal3);
		
		/*
		 * ����һ��8λ�Ķ�������������ֵĬ��ռ32λ���������һ������
		 * ֻ��ǿ������ת����byteʱ��������������յ���binVal4�����-23
		 */
		byte binVal4 = (byte) 0b1110_1001;
		System.out.println(binVal4);
		
		/*
		 * ����һ��32λ�Ķ������������λ��1
		 * ��������ֵ�����L��׺����˸�������ʵ��ռ64λ����32λ��1���Ƿ���λ��
		 * ���binVal5��ֵ����2��31�η�+2+1
		 */
		
		long binVal5 = 0B1000_0000_0000_0000_0000_0000_0000_0011L;
		System.out.println(binVal5);
		
	}



}
