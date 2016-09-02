package java09;

public class A2 extends Apple{
	//重写父类方法
	public String getInfo(){
		//super.getInfo方法返回值是Object类型
		//所以加toString才返回String类型
		return super.getInfo().toString();
	}
}
