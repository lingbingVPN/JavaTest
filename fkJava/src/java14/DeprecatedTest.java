package java14;

class Apple{
	//����info�����ѹ�ʱ
	@Deprecated
	public void info(){
		System.out.println("Apple��info����");
	}
}
public class DeprecatedTest {
	public static void mian(String[] args){
		//����ʹ��info����ʱ���ᱻ����������
		new Apple().info();
		
	}
}
