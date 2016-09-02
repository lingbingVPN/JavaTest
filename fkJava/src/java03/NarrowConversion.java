package java03;

public class NarrowConversion {
	public static void main(String[] args){
		int iValue=233;
		//强制把一个int类型的值转换为byte类型的值
		byte bValue=(byte) iValue;
		//因为溢出，将输出负数-23
		System.out.println(bValue);
		
		double dValue = 3.98;
		//强制把一个double类型的值转换为int
		int tol=(int)dValue;
		//浮点数转整数，将直接把浮点数小数部分切掉，不做四舍五入运算
		System.out.println(tol);
	}
}
