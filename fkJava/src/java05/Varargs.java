package java05;

public class Varargs {
	//����һ���βθ����ɱ�ķ���
	public static void test(int a,String...books){
		//books���������鴦��
		for(String tmp:books){
			System.out.println(tmp);
		}
		//�����������a��ֵ
		System.out.println(a);
	}
	
	public static void main(String[] args){
		//����test()����
		test(5, "���Java����","������JavaEE��ҵӦ��ʵս");
	}
}
