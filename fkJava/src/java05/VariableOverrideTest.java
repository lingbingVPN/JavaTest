package java05;

import java.util.jar.Attributes.Name;

public class VariableOverrideTest {
	//����һ��nameʵ������
	private String name="���";
	//����һ��price�����
	private static double price=78.0;
	
	//����������
	public static void main(String[] args){
		//������ľֲ��������ֲ��������ǳ�Ա����
		int price=65;
		//ֱ�ӷ���price�����������price�ֲ�������ֵ��65
		System.out.println(price);
		//ʹ��������Ϊprice�������޶�
		//�����price �������ֵ78.0
		System.out.println(VariableOverrideTest.price);
		//����info����
		new VariableOverrideTest().info();
	}
	
	public void info(){
		//������ľֲ��������ǳ�Ա����
		String name="�����";
		//ֱ�ӷ���name�����������name�ֲ�������ֵ�������
		System.out.println(name);
		//ʹ��this����Ϊname�������޶�
		//�����nameʵ��������ֵ�����
		System.out.println(this.name);
	}
}
