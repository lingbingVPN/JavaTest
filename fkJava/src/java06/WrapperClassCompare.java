package java06;

public class WrapperClassCompare {
	public static void main(String[] args){
		Integer a=new Integer(6);
		System.out.println("6的包装类实例是否大于5.0?"+(a>5.0));
		
		//下面两个包装类的的实例的值虽然都是2，但是每次创建包装类都是一个新对象
		System.out.println("比较两个包装类的实例是否相等："+(new Integer(2)==new Integer(2)));
		//通过自动装箱，允许把基本类型值赋值给包装类的实例
		Integer ina=2;
		Integer inb=2;
		System.out.println("两个自动装箱后是否相等？"+(ina==inb));
		System.out.println("两个2自动装箱后的内容是否相同？"+ina.equals(inb));
		//如果是通过new创建的包装类实例就不是一个对象
		//如果通过自动装箱来创建的包装类实例就是一个对象??
		
		
		Integer biga=128;
		Integer bigb=128;
		System.out.println("两个128自动装箱后是否相等？"+(biga==bigb));
		System.out.println("两个128自动装箱后的内容相同？"+(biga.equals(bigb)));
		
		
	}
}
