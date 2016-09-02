package java06;

public class UnsignedTest {
	public static void main(String[] args){
		byte b=-3;
		//将byte类型的-3转换为无符号征税
		System.out.println(Byte.toUnsignedInt(b));
		//指定使用16进制解析无符号证书
		int val=Integer.parseUnsignedInt("ab",16);
		System.out.println(val);
		//将-12转换为无符号int型，然后转换为16进制的字符串
		System.out.println(Integer.toUnsignedString(-12, 16));
		//将两个数转换为无符号整数后相除
		System.out.println(Integer.divideUnsigned(-2, 3));
		//将两个数转换为无符号整数相处后求余
		System.out.println(Integer.remainderUnsigned(-2, 7));
	}
}
