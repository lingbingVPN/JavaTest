package java05;

class Animal3{
	private void beat(){
		System.out.println("��������...");
	}
	
	public void breath(){
		beat();
		System.out.println("��һ��������һ������������..");
	}
}

//�̳�Animal3��ֱ�Ӹ��ø����breath����
class Bird3 extends Animal3{
	public void fly(){
		System.out.println("����������ڵķ���...");
	}
}

class Wolf3 extends Animal3{
	public void run(){
		System.out.println("����½���ϵĿ��ٱ���...");
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
