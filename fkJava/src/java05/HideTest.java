package java05;

class Parent{
	public String tag="���Java����";
}

class Derived extends Parent{
	//����һ��˽�е�tagʵ�����������ظ����tagʵ������
	private String tag="������JavaEE��ҵӦ��ʵս";
}
public class HideTest {
	public static void main(String[] args){
		Derived d=new Derived();
		//���򲻿ɷ���d��˽�б���tag������������佫����������
//		System.out.println(d.tag);
		//��d������ʾ������ת��ΪParent��
		//���ɷ���tagʵ������
		System.out.println(((Parent)d).tag);
	}
}
