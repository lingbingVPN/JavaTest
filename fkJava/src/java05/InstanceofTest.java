package java05;

public class InstanceofTest {
	public static void main(String[] args){
		//����helloʱʹ��Object��
		//��hello�ı���������Object
		//Object��������ĸ��࣬��hello������ʵ��������String
		Object hello="Hello";
		//String��Object���ڼ̳й�ϵ�����Խ���Instanceof����
		System.out.println("�ַ����Ƿ���Object���ʵ����"+
				(hello instanceof Object));
		System.out.println("�ַ����Ƿ���String���ʵ��?"+
				(hello instanceof String));
		//Math��Object����ڼ̳й�ϵ�����Խ���instanceof����
		System.out.println("�ַ�����Math���ʵ����"+
				(hello instanceof Math));
		//Stringʵ����Comparable�ӿ�
		System.out.println("�ַ����Ƿ���Comparable�ӿڵ�ʵ����"
					+ (hello instanceof Comparable));
		
		String a="Hello";
		// String����Math��û�м̳й�ϵ�����������������޷�ͨ��
//		System.out.println("�ַ����Ƿ���Math���ʵ����"
//				+(a instanceof Math));
	}
}
