package java06;

public class StringCompareTest {
	public static void main(String[] args){
		//s1ֱ�����ó������е�"���Java"
		String s1="���Java";
		String s2="���";
		String s3="Java";
		//s4������ַ���ֵ�����ڱ���ʱ��ȷ������
		//s4ֱ�����ó������е�"���Java"
		String s4="���"+"Java";
		//s5������ַ���ֵ�����ڱ���ʱ��ȷ������
		//s5ֱ�����ó�������"���Java"
		String s5="��"+"��"+"Java";
		//s6������ַ���ֵ�����ڱ���ʱ��ȷ������
		//�������ó������е��ַ���
		String s6=s2+s3;
		//ʹ��new���ù��������ᴴ��һ���µ�String����
		//s7���ö��ڴ����´�����String����
		String s7=new String("���Java");
		
		
		System.out.println(s1==s4);
		System.out.println(s1==s5);
		System.out.println(s1==s6);
		System.out.println(s1==s7);
	}
}
