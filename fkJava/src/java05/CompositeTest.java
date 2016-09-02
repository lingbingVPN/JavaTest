package java05;

import javax.swing.plaf.basic.BasicLabelUI;

class Animal2{
	private void beat(){
		System.out.println("��������...");
	}
	
	public void breath(){
		beat();
		System.out.println("��һ��������һ������������...");
	}
}

class Bird2{
	//��ԭ���ĸ�����ϵ�ԭ��������
	//��Ϊ�����һ����ϲ���
	private Animal2 a;
	
	public Bird2(Animal2 a){
		this.a=a;
	}
	
	//���¶���һ���Լ���Breath()����
	public void breath(){
		//ֱ�Ӹ���Animal�ṩ��breath������ʵ��Bird��breath����
		a.breath();
	}
	
	public void fly(){
		System.out.println("����������ڵķ���...");
		}
	
}

class Wolf2{

	// ��ԭ���ĸ�����ϵ�ԭ�������࣬��Ϊ�����һ����ϳɷ�
	private Animal2 a;
	public Wolf2(Animal2 a)
	{
		this.a = a;
	}
	// ���¶���һ���Լ���breath()����
	public void breath()
	{
		// ֱ�Ӹ���Animal�ṩ��breath()������ʵ��Wolf��breath()������
		a.breath();
	}
	public void run()
	{
		System.out.println("����½���ϵĿ��ٱ���...");
	}
}

public class CompositeTest {
	public static void main(String[] args){
		//��ʱ��Ҫ��ʽ��������ϵĶ���
		Animal2 al2=new Animal2();
		Bird2 b2=new Bird2(al2);
		b2.breath();
		b2.fly();
		
		//��ʱ��Ҫ��ʽ��������ϵĶ���
		Animal2 al3=new Animal2();
		Wolf2 wolf2=new Wolf2(al3);
		wolf2.breath();
		wolf2.run();
	}
}
