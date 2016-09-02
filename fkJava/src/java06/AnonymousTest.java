package java06;


interface Product2{
	public double getPrice();
	public String getName();
}

public class AnonymousTest {
	public void test(Product2 p){
		System.out.println("购买了一个" + p.getName()
		+ "，花掉了" + p.getPrice());
	}
	
	public static void main(String[] args){
		AnonymousTest ta=new AnonymousTest();
		//调用test方法是，需要穿入一个Product蚕食
		//此处传入其匿名实现类的实例
		ta.test(new Product2() {
			
			@Override
			public double getPrice() {
				// TODO Auto-generated method stub
				return 567.8;
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "AGP显卡";
			}
		});
	}
}
