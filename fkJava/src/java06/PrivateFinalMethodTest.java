package java06;

public class PrivateFinalMethodTest {
	private final void test(){}
}

class Sub2 extends PrivateFinalMethodTest{
	//下面方法定义将不会出现问题
	public void test(){}
		
}
