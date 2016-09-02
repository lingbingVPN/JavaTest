package java05;


class Person2{
	//定义一个实例变量
	public String name;
	//定义一个类变量
	public static int eyeNum;
}
public class PersonTest2 {
	public static void mian(String[] args){
		/*
		 * 第一次主动使用Person2类，该类自动初始化
		 * 则eyeNum变量开始起作用，输出0
		 * 类变量可以通过类名直接访问，也可以通过实例直接访问
		 * 其实通过实例访问类变量时，使用的还是实例所属的那个类
		 */
		System.out.println("Person的eyeNum类变量值："+Person2.eyeNum);
		//创建Person2实例
		Person2 p=new Person2();
		/*
		 * 通过Person2实例的引用p来访问Person2对象的实例变量name
		 * 并通过实例变量访问eyeNum
		 */
		System.out.println("p对象的name变量的值是:"+p.name+"p对象的eyeNum变量的值是:"+p.eyeNum);
		//直接为name变量赋值为孙悟空
		p.name ="孙悟空";
		//通过p对象访问的eyeNum类变量，依然是访问Person2的eyeNum类变量
		p.eyeNum=2;
		//再次通过p对象来访问name和eyeNum
		System.out.println("name的值是:"+p.name+"eyeNum的值是："+p.eyeNum);
		//输出eyeNum的值
		System.out.println(Person2.eyeNum);
		//
		Person2 p2=new Person2();
		//p2访问的eyeNum类变量依然引用Person2类的
		System.out.println(p2.eyeNum);
	}
}
