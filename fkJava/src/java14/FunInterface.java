package java14;


//����ʽ�ӿڱ�ǩ
@FunctionalInterface
public interface FunInterface {
	static void foo(){
		System.out.println("foo�෽��");
	}
	
	default void bar(){
		System.out.println("barĬ�Ϸ���");
	}
	
	void abc();
}
