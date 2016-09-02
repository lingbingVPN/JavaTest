package java06;

interface FkTest{
	void run();
}

public class LambdaTest {
	public static void main(String[] args){
		//Runable接口中只包含一个无参数的方法
		//Lambda表达式代表的匿名方法实现了Runbale接口中
		//唯一的，无参数的方法
		//因此下面的Lambda表达式创建了Runable对象
		Runnable r=()->{
			for(int i=0;i<100;i++){
				System.out.println();
			}
		};
		
		//下面代码报错：不兼容的类型：Object不是函数接口
//		Object o=()->{
//			for(int i = 0 ; i < 100 ; i ++)
//				{
//					System.out.println();
//				}
//		};
		
		Object obj1=(Runnable)()->{
			for(int i=0;i<100;i++){
				System.out.println();
			}
		};
		
		/*同样的Lambda表达式可以被当成不同的目标类型
		 * 唯一的要求是：
		 * Lambda表达式的形参列表与函数式接口中
		 * 唯一的抽象方法的形参列表相同
		 */
		Object obj2=(FkTest)()->{
			for(int i=0;i<100;i++){
				System.out.println();
			}
		};
		
	}
}
