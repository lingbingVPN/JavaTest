package java04;

import javax.xml.bind.helpers.ParseConversionEventImpl;

class Person{
	public int age;
	public double height;
	//����һ��info����
	public void info(){
		System.out.println("�ҵ�������:"+age+"���ҵ������:"+height);
	}
}
public class ReferenceArrayTest {
	public static void main(String[] args){
		//����һ��students�����������������Person[]
		Person[] students;
		//Ϊ����ִ�ж�̬��ʼ��
		students=new Person[2];
		//����һ��Personʵ�����������Personʵ������zhang����
		Person zhang=new Person();
		//Ϊzhang�����õ�Person�����age��height��ֵ
		zhang.age=15;
		zhang.height=158;
		//����һ��Personʵ�����������Personʵ������lee����
		Person lee=new Person();
		//Ϊlee�����õ�Person�����age��height��ֵ
		lee.age=16;
		lee.height=161;
		//��zhang������ֵ������һ������Ԫ��
		students[0] =zhang;
		//��lee������ֵ�����ڶ�������Ԫ��
		students[1]=lee;
		//��������ִ�н��һ��
		lee.info();
		students[1].info();
		
	}
}
