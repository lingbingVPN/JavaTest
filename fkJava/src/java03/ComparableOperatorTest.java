package java03;

public class ComparableOperatorTest {
	public static void main(String[] args){
		System.out.println("5是否大于4.0:"+(5>4.0));
		System.out.println("5和5.0是否相等:"+(5==5.0));
		System.out.println("97是否和'a'相等:"+(97=='a'));
		System.out.println("true和false是否相等:"+(true==false));
		//创建两个ComparableOperatorTest对象分别赋予t1和t2
		ComparableOperatorTest t1=new ComparableOperatorTest();
		ComparableOperatorTest t2=new ComparableOperatorTest();
		
		//创建两个ComparableOperatorTest实例，分别赋予t1和t2
		//接下来比较t1和t2是否是同一个对象,结果显示不是
		System.out.println(t1==t2);
		//t2和t3的引用内存地址是一样的，所以它们是同一个对象，就像同一件衣服上的两个标签
		ComparableOperatorTest t3 = t2;
		System.out.println(t2==t3);
	}
}
