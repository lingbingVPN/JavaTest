package java06;

import java04.ReturnTest;

public enum Gender3 implements GenderDesc{
	//此处的枚举值必须调用对应构造器来创建
	MALE("男"){
		public void info(){
			System.out.println("这个枚举值代表男性");
		}
	},
	FEMALE("女"){
		public void info(){
			System.out.println("这个枚举值代表女性");
		}
	};
	
	private final String name;
	//枚举类的构造器只能使用private修饰
	private Gender3(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
	
	//增加下面的info方法，实现GenderDesc接口必须实现的方法
	public void info(){
		System.out.println("这是一个用于用于定义性别的枚举类");
	}
	
	
	
}
