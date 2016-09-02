package java05;

public class OverloadVarargs {
	public void test(String msg){
		System.out.println("只有一个字符串参数的test方法");
	}
	//因为前面已经有了test()方法,test()方法里有一个字符串参数
	//因此的长度可变形参里不包含一个字符串参数的 形式
	public void test(String...books){
		System.out.println("*****形参长度可变的test方法*****");
	}
	public static void main(String[] args){
		OverloadVarargs olv=new OverloadVarargs();
		//下面两次调用将执行第二个test()方法
		olv.test();
		olv.test("aa","bb");
		//下面将执行第一个test()方法
		olv.test("aa");
		//下面将调用执行第二个test()方法
		olv.test(new String[]{"aa"});
	}
}
