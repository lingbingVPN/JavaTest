package java04;

public class DeadForTest {
	public static void main(String[] args){
		//省略了for循环三个部分，循环条件将一直为true
		//因为没有停止循环的条件设定，所以是死循环
		for(;;){
			System.out.println("============");
		}
	}
}
