package java06;

public class Computer {
	private Output output;
	public Computer(Output out){
		this.output=out;
	}
	
	//定义一个模拟获取字符串输入的方法
	public void keyIn(String msg){
		output.getData(msg);
	}
	//定义一个模拟打印的方法
	public void print(){
		output.out();
	}
}
