package java05;

public class PersonTest {
	public static void manin(String[] args){
		//使用Person类定义一个Person类型的变量
		Person p;
		//通过new关键字调用Person类的构造器，返回一个Person实例
		//再将该实例对象变量赋予p变量
		p = new Person();
		
		//上面代码组合成一句
		Person p2 = new Person();
		
		//通过实例来访问普通成员变量，并为其赋值
		p.name = "李刚";
		p.age = 45;
		//通过实例来调用普通方法
		p.say("Java语言很好，学起来很容易");
		
		//直接输出p的实例变量
		System.out.println(p.name);
		System.out.println(p.age);
		
		//将p变量的值赋给p2变量
		p2=p;
		System.out.print(p2.name);
		System.out.println(p2.age);
	}
}
