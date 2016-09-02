package java04;

import javax.xml.bind.helpers.ParseConversionEventImpl;

class Person{
	public int age;
	public double height;
	//定义一个info方法
	public void info(){
		System.out.println("我的年龄是:"+age+"，我的身高是:"+height);
	}
}
public class ReferenceArrayTest {
	public static void main(String[] args){
		//定义一个students数组变量，其类型是Person[]
		Person[] students;
		//为数组执行动态初始化
		students=new Person[2];
		//创建一个Person实例，并将这个Person实例赋给zhang变量
		Person zhang=new Person();
		//为zhang所引用的Person对象的age、height赋值
		zhang.age=15;
		zhang.height=158;
		//创建一个Person实例，并将这个Person实例赋给lee变量
		Person lee=new Person();
		//为lee所引用的Person对象的age、height赋值
		lee.age=16;
		lee.height=161;
		//将zhang变量的值赋给第一个数组元素
		students[0] =zhang;
		//将lee变量的值赋给第二个数组元素
		students[1]=lee;
		//下面代码的执行结果一样
		lee.info();
		students[1].info();
		
	}
}
