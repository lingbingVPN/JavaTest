package java06;


interface Product2{
	public double getPrice();
	public String getName();
}

public class AnonymousTest {
	public void test(Product2 p){
		System.out.println("������һ��" + p.getName()
		+ "��������" + p.getPrice());
	}
	
	public static void main(String[] args){
		AnonymousTest ta=new AnonymousTest();
		//����test�����ǣ���Ҫ����һ��Product��ʳ
		//�˴�����������ʵ�����ʵ��
		ta.test(new Product2() {
			
			@Override
			public double getPrice() {
				// TODO Auto-generated method stub
				return 567.8;
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "AGP�Կ�";
			}
		});
	}
}
