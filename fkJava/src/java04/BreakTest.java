package java04;

public class BreakTest {
	public static void main(String[] args){
		//一个简单的for循环
		for(int i=0;i<10;i++){
			System.out.println("i的值是："+i);
			if(i==2){
				break;
			}
		}
	}
}
