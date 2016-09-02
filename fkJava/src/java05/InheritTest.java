package java05;

class Animal3{
	private void beat(){
		System.out.println("心脏跳动...");
	}
	
	public void breath(){
		beat();
		System.out.println("吸一口气，吐一口气，呼吸中..");
	}
}

//继承Animal3，直接复用父类的breath方法
class Bird3 extends Animal3{
	public void fly(){
		System.out.println("我在天空自在的飞翔...");
	}
}

class Wolf3 extends Animal3{
	public void run(){
		System.out.println("我在陆地上的快速奔跑...");
	}
}
public class InheritTest {
	public static void main(String[] args){
		Bird3 b3=new Bird3();
		b3.breath();
		b3.fly();
		Wolf3 w3= new Wolf3();
		w3.breath();
		w3.run();
	}
}
