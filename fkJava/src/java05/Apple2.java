package java05;

public class Apple2 {
	public String name;
	public String color;
	public double weight;
	//无参构造器
	public Apple2(){
		
	}
	//两个参数的构造器
	public Apple2(String name, String color){
		this.name=name;
		this.color=color;
	}
	//三个参数的构造器
	public Apple2(String name, String color, double weight){
		//通过this调用另一个重载的构造器的初始化代码
		this(name,color);
		//下面this引用该构造器正在初始化的Java对象
		this.weight=weight;
	}
}
