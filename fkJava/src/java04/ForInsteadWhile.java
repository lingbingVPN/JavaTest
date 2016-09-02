package java04;

public class ForInsteadWhile {
	public static void main(String[] args){
		//把for循环的初始化天剑提出来单独定义
		int count=0;
		//for循环只放循环条件
		for(;count<10;){
			System.out.println(count);
			//把循环迭代部分放在循环体之后定义
			count++;
		}
		System.out.println("循环结束!");
		//在循环体之外还可以访问count
		System.out.println(count);
	}
}
