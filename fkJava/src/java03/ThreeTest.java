package java03;

public class ThreeTest {
	public static void main(String[] args){
		/*
		 * ��Ŀ�������ж�һ�����ʽ�Ƿ����
		 * ��������Ļ��ͷ�����ߵı��ʽ
		 * ����������ͷ����ұߵı��ʽ
		 * ��Ŀ����Ҳ����Ƕ��ʹ�ã�����Ҫ���������ʹ��
		 */
		String str=5>3?"5����3":"5С��3";
		System.out.println(str);
		String str2=null;
		if(5>3){
			str2="5����3";
		}else{
			str2="5С��3";
		}
		System.out.println(str2);
		
		int a=11;
		int b=12;
		//��Ŀ�����֧��Ƕ��
		System.out.println(a>b?"a����b":(a<b?"aС��b":"a����b"));
		//
	}
}
