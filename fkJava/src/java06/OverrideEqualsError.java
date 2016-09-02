package java06;

class Person{
	//重写equals方法，提供自定义的相等标准
	public boolean equals(Object obj){
		//不加判断，直接返回true
		return true;
	}
}

//定义一个空类Dog
class Dog{}


public class OverrideEqualsError {
	public static void main(String[] args){
		Person p=new Person();
		System.out.println(p.equals(new Dog()));
		System.out.println(p.equals(new String("Hello")));
		
		//因为Person类的equals方法被重写了
		//所以不管怎么样都会返回true
	}
}
