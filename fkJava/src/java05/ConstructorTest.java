package java05;

import javax.swing.plaf.ViewportUI;

import org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS;

public class ConstructorTest {
	public String name;
	public int count;
	//�ṩ�Զ���Ĺ��������ù�����������������
	public ConstructorTest(String name, int count){
		//���������this��������ʼ���Ķ���
		//�������д��뽫�����2����������this��������name��countʵ������
		this.name=name;
		this.count=count;
	}
	public static void main(String[] args){
		//ʹ���Զ���Ĺ���������������
		//ϵͳ����Ըö���ִ���Զ���ĳ�ʼ��
		ConstructorTest tc=new ConstructorTest("Java����", 90000);
		//���ConstructorTest�����name��count����ʵ������
		System.out.println(tc.name+"------"+tc.count);
	}
}
