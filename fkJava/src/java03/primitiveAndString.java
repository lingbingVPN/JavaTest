package java03;

public class primitiveAndString {
	public static void main(String[] args){
		//������뽫������Ϊ5��һ������������ֱ�Ӹ���һ���ַ���
		String str1="5";
		//���Ҫ����ֵ����ַ�����Ҫô�üӷ�ƴ�ӣ�Ҫô��˫����
		//���������һ����������һ���ո���ʵ��ƴ�ӳ��ַ���
		String str2=3.5f+"";
		
		//����Ĵ���������ֵ���㣬Ȼ�����üӷ�����ֵ���ַ���ƴ�ӳ��µ��ַ���
		System.out.println(3+4+"Hello!");
		//���������ַ���ƴ�ӣ�Ȼ���ٰ�4Ҳƴ������
		System.out.println("Hello!"+3+4);
	}
}
