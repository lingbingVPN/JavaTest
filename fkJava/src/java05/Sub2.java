package java05;

import java03.Test;

class Base2{
	public Base2(){
		test();
	}
	
	public void test(){
		System.out.println("����������д�ķ���");
	}
}
public class Sub2 extends Base2{
	private String name;
	public void test(){
		System.out.println("������д����ķ���"
				+ "����name�ַ�������"+name.length());
	}
	
	public static void main(String[] args){
		//��ָ���쳣
		Sub2 s2=new Sub2(); 
	}
}
