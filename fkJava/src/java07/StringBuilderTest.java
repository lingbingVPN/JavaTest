package java07;

public class StringBuilderTest {
	public static void main(String[] args){
		StringBuilder sb=new StringBuilder();
		
		//׷���ַ���
		sb.append("java");
		//����
		sb.insert(0, "hello");
		//�滻
		sb.replace(5, 6, ",");
		//ɾ��
		sb.delete(5, 6);
		System.out.println(sb);
		//��ת
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		//�ı�StringBuilder�ĳ��ȣ���ֻ����ǰ�沿��
		sb.setLength(5);
		System.out.println(sb);
	}
}
