package java05;

public class OverloadVarargs {
	public void test(String msg){
		System.out.println("ֻ��һ���ַ���������test����");
	}
	//��Ϊǰ���Ѿ�����test()����,test()��������һ���ַ�������
	//��˵ĳ��ȿɱ��β��ﲻ����һ���ַ��������� ��ʽ
	public void test(String...books){
		System.out.println("*****�βγ��ȿɱ��test����*****");
	}
	public static void main(String[] args){
		OverloadVarargs olv=new OverloadVarargs();
		//�������ε��ý�ִ�еڶ���test()����
		olv.test();
		olv.test("aa","bb");
		//���潫ִ�е�һ��test()����
		olv.test("aa");
		//���潫����ִ�еڶ���test()����
		olv.test(new String[]{"aa"});
	}
}
