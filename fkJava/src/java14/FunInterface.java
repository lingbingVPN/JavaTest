package java14;


//函数式接口标签
@FunctionalInterface
public interface FunInterface {
	static void foo(){
		System.out.println("foo类方法");
	}
	
	default void bar(){
		System.out.println("bar默认方法");
	}
	
	void abc();
}
