package java05;

import java03.Test;

class Base2{
	public Base2(){
		test();
	}
	
	public void test(){
		System.out.println("将被子类重写的方法");
	}
}
public class Sub2 extends Base2{
	private String name;
	public void test(){
		System.out.println("子类重写父类的方法"
				+ "，其name字符串唱的"+name.length());
	}
	
	public static void main(String[] args){
		//空指针异常
		Sub2 s2=new Sub2(); 
	}
}
