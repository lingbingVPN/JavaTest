package java04;

public class DoWhileTest {
	public static void main(String[] args){
		/*
		 * do while至少会循环一次
		 */
		//定义变量count
		int count=1;
		//执行do-while循环
		do {
			System.out.println(count);
			count++;
		} while (count<10);
		System.out.println("循环结束");
		
		
		//定义变量count2
		int count2=20;
		//执行do while循环
		do{
			System.out.println(count2++);
		}while(count2<10);
		System.out.println("循环结束");
	}
}
