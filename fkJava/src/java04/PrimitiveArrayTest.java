package java04;

public class PrimitiveArrayTest {
	public static void mian(String[] args) {
		//定义一个int[]类型的数组变量
		int[] iArr;
		//动态初始化数组，数组长度为5
		iArr=new int[5];
		//采用循环方式为每个数组元素进行赋值
		for(int i=0;i<5;i++)
		{
			iArr[i]=i+10;
			System.out.println(iArr[i]);
		}
		
	}
}
