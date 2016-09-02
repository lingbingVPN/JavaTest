package java05;

import javax.swing.plaf.basic.BasicLabelUI;

class Animal2{
	private void beat(){
		System.out.println("心脏跳动...");
	}
	
	public void breath(){
		beat();
		System.out.println("吸一口气，吐一口气，呼吸中...");
	}
}

class Bird2{
	//将原来的父类组合到原来的子类
	//作为子类的一个组合部分
	private Animal2 a;
	
	public Bird2(Animal2 a){
		this.a=a;
	}
	
	//重新定义一个自己的Breath()方法
	public void breath(){
		//直接复用Animal提供的breath方法来实现Bird的breath方法
		a.breath();
	}
	
	public void fly(){
		System.out.println("我在天空自在的飞翔...");
		}
	
}

class Wolf2{

	// 将原来的父类组合到原来的子类，作为子类的一个组合成分
	private Animal2 a;
	public Wolf2(Animal2 a)
	{
		this.a = a;
	}
	// 重新定义一个自己的breath()方法
	public void breath()
	{
		// 直接复用Animal提供的breath()方法来实现Wolf的breath()方法。
		a.breath();
	}
	public void run()
	{
		System.out.println("我在陆地上的快速奔跑...");
	}
}

public class CompositeTest {
	public static void main(String[] args){
		//此时需要显式创建被组合的对象
		Animal2 al2=new Animal2();
		Bird2 b2=new Bird2(al2);
		b2.breath();
		b2.fly();
		
		//此时需要显式创建被组合的对象
		Animal2 al3=new Animal2();
		Wolf2 wolf2=new Wolf2(al3);
		wolf2.breath();
		wolf2.run();
	}
}
