package java05;

public class Dog {
	//定义一个jump方法
	public void jump(){
		System.out.println("正在执行jump方法");
	}
	//定义一个run方法
//	public void run(){
//		Dog d = new Dog();
//		d.jump();
//		System.out.println("正在执行run方法");
//	}
	
	
	//定义一个run方法，run方法需要记住jump方法
	public void run(){
		//使用this引用调用run方法的对象
		this.jump();
		System.out.println("正在执行run方法");
		
	}
}
