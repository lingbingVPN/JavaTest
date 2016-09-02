package java06;

public class AccessStaticInnerClass {
	static class StaticInnerClass{
		private static int prop1=5;
		private int prop2=9;
	}
	
	public void accessInnerProp(){
		//prop1 cannot be resolved to a variable
		//访问内部类的类成员时，应该以内部类名来访问
//		System.out.println(prop1);
		//正确示范
		System.out.println(StaticInnerClass.prop1);
		//访问内部类普通成员时，应通过内部类的实例来访问
//		System.out.println(prop2);
		//正确示范
		System.out.println(new StaticInnerClass().prop2);
		
	}
}
