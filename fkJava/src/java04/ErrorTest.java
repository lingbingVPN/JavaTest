package java04;

public class ErrorTest {
	public static void main(String[] args)
	{
//		int age=45;
//		if(age>20)
//		{
//			System.out.println("青年人");
//		}
//		else if(age >40)
//		{
//			System.out.println("中年人");
//		}
//		else {
//			System.out.print("老年人");
//		}
		//if语句应优先处理范围小的条件
		
		int age=45;
		if (age>60)
		{
			System.out.println("老年人");
		}
		else if (age>40) {
			System.out.println("中年人");
		}
		else {
			System.out.println("青年人");
		}
	}
}
