package java05;

import java.sql.SQLNonTransientConnectionException;

public class Overload {
	//���涨��������test()���������������β��б�ͬ
	//ϵͳ�����������������������ֱ���Ϊ��������
	public void test(){
		System.out.println("�޲���");
	}
	public void test(String msg){
		System.out.println("���ص�test����"+msg);
	}
	
	public static void main(String[] args){
		Overload o1=new Overload();
		//��һ�ε���test()ʱû�д�����������ϵͳ��������û�в�����test()����
		o1.test();
		//�ڶ��ε���test(String msg)ʱ
		//������һ��String���͵��ַ�������
		//���ϵͳ���������һ���ַ���������test(String msg)����
		o1.test("hello,���ǵڶ����в��������ط���");
	}
}
