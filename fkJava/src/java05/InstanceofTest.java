package java05;

public class InstanceofTest {
	public static void main(String[] args){
		//声明hello时使用Object类
		//则hello的编译类型是Object
		//Object是所有类的父类，但hello变量的实际类型是String
		Object hello="Hello";
		//String与Object存在继承关系，可以进行Instanceof运算
		System.out.println("字符串是否是Object类的实例？"+
				(hello instanceof Object));
		System.out.println("字符串是否是String类的实例?"+
				(hello instanceof String));
		//Math与Object类存在继承关系，可以进行instanceof运算
		System.out.println("字符串是Math类的实例？"+
				(hello instanceof Math));
		//String实现了Comparable接口
		System.out.println("字符串是否是Comparable接口的实例？"
					+ (hello instanceof Comparable));
		
		String a="Hello";
		// String类与Math类没有继承关系，所以下面代码编译无法通过
//		System.out.println("字符串是否是Math类的实例？"
//				+(a instanceof Math));
	}
}
