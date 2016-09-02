package java05;

class BaseClass2{
	public int book=6;
	public void base(){
		System.out.println("父类的普通方法");
	}
	
	public void test(){
		System.out.println("父类的被覆盖的方法");
	}
}	
public class SubClass2 extends BaseClass2{
	//重新定义一个book实例变量隐藏父类的book实例变量
	public String book="轻量级Java EE企业应用实战";
	
	public void test(){
		System.out.println("子类覆盖父类的方法");
	}
	
	public void sub(){
		System.out.println("子类的普通方法");
	}
	
	public static void main(String[] args){
		//下面编译时类型和运行时类型完全一样，因此不存在多态
		BaseClass2 bc=new BaseClass2();
		System.out.println(bc.book);
		
		//下面两次调用将执行BaseClass的方法
		bc.base();
		bc.test();
		//下面编译时类型和运行时类型完全一样，所以不存在多套
		SubClass2 sc=new SubClass2();
		System.out.println(sc.book);
		//下面调用从父类集成到的base方法
		sc.base();
		//下面将执行当前类的test方法
		sc.test();
		
		//下面编译时类型和运行时类型不一样，多态发生
		//创建一个子类对象，然后赋给父类的变量
		BaseClass2 ploymophicBc=new SubClass2();
		//这里ploymophicBc作为父类对象，访问自己的book成员变量
		System.out.println(ploymophicBc.book);
		//这里ploymophicBc在子类里找不到base方法，所以执行父类的base方法
		ploymophicBc.base();
		//这里ploymophicBc在子类和父类里都找到了test方法
		//但是以为父类的方法已经被子类继承并覆盖，所以只能执行子类的test方法
		ploymophicBc.test();
		//以为内ploymophicBc的编译类型是BaseClass
		//BaseClass类没有提供sub方法，所以下面代码将报错
//		ploymophicBc.sub();
	}
}
