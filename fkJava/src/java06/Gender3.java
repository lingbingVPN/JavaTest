package java06;

import java04.ReturnTest;

public enum Gender3 implements GenderDesc{
	//�˴���ö��ֵ������ö�Ӧ������������
	MALE("��"){
		public void info(){
			System.out.println("���ö��ֵ��������");
		}
	},
	FEMALE("Ů"){
		public void info(){
			System.out.println("���ö��ֵ����Ů��");
		}
	};
	
	private final String name;
	//ö����Ĺ�����ֻ��ʹ��private����
	private Gender3(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
	
	//���������info������ʵ��GenderDesc�ӿڱ���ʵ�ֵķ���
	public void info(){
		System.out.println("����һ���������ڶ����Ա��ö����");
	}
	
	
	
}
