package java05;

public class Dog {
	//����һ��jump����
	public void jump(){
		System.out.println("����ִ��jump����");
	}
	//����һ��run����
//	public void run(){
//		Dog d = new Dog();
//		d.jump();
//		System.out.println("����ִ��run����");
//	}
	
	
	//����һ��run������run������Ҫ��סjump����
	public void run(){
		//ʹ��this���õ���run�����Ķ���
		this.jump();
		System.out.println("����ִ��run����");
		
	}
}
