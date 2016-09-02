package java06;

class Person3{
	private String name;
	public Person3(String name){
		this.name=name;
	}
}
public class PrintObject {
	public static void main(String[] args){
		//创建一个Person对象，将之赋给p变量
		Person3 p=new Person3("孙悟空");
		//打印p所引用的Person对象
		System.out.println(p);
	}
}
