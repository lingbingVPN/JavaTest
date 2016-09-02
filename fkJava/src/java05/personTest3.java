package java05;

public class personTest3 {
	public static void main(String[] args){
		Person3 p=new Person3();
		//因为age成员变量已被隐藏，不能直接访问
		//所有下面代码将出现编译错误
//		p.age=10;
		//下面通过setAge方法可以访问到age成员变量
		//但是会提示“您输入的年龄不合法”
		p.setAge(1000);
		//访问p的age成员变量也必须通过其对应的getAge方法
		//因为上面的设置不合法，所以下面输出的age的值将为原始值：0
		System.out.println(p.getAge());
		//下面设置符合要求，可以成功
		p.setAge(30);
		//将age输出
		System.out.println(p.getAge());
		//不能直接操作p的name成员变量，只能通过对应的
		//getName和setName方法
		p.setName("李刚");
		System.out.println(p.getName());
	}
}
