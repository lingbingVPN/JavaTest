package java14;

public class Fruit {
	public void info(){
		System.out.println("ˮ����info����");
	}
}

class Apple2 extends Fruit{
	//ʹ��@Overrideָ�����淽��������д���෽��
	@Override
	public void info(){
		System.out.println("ƻ����дˮ����info����");
	}
}
