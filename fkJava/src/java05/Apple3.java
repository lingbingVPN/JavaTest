package java05;

public class Apple3 extends Fruit{
	public static void main(String[] args){
		//创建Apple对象
		Apple3 a3=new Apple3();
		//Apple对象本身没有weight成员变量
		//因为Apple的父类有weight成员变量
		//也可以访问Apple对象的weight成员变量
		a3.weight=56;
		//调用Apple方法的info方法
		a3.info();
	}
}
