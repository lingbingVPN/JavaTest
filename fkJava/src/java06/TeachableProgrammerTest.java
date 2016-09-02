package java06;

public class TeachableProgrammerTest {
	public static void main(String[] args){
		TeachableProgrammer tp=new TeachableProgrammer("李刚");
		//直接调用TeachableProgrammer类从
		//Programmer类继承到的work方法
		tp.work();
		
		
		//表面上调用的是Closure的work方法
		//实际上是回调TeachableProgrammer的teach方法
		tp.getCallbackReference();
	}
}
