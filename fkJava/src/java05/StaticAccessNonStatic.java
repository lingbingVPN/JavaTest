package java05;

import javax.sound.midi.MidiDevice.Info;

public class StaticAccessNonStatic {
	public void info(){
		System.out.println("简单的info方法");
	}
	
	public static void main(String[] args){
		//因为main方法是static修饰的静态方法，info是非静态方法
		//调用main的是类的本身，不是该类的实例
		//所以省略的this无法指向有效的对象
//		info();
		
		//静态成员不能访问非静态成员，普通成员方法只能由实例才能调用
//		StaticAccessNonStatic static1=new StaticAccessNonStatic();
//		static1.info();
		
		new StaticAccessNonStatic().info();
		
		
	}
}
