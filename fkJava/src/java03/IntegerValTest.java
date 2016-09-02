package java03;

public class IntegerValTest {
	public static void main(String[] args){
		//下面代码是正确的，系统会自动把56当成byte类型处理
		byte a =56;
		System.out.println(a);
		
		/*
		 * 下面代码是错误的，系统不会把9999999999999999当成long型处理
		 * 因为超出int的表数范围，从而引起错误
		 */
//		long bigValue=99999999999999999;
		
		/*
		 * 下面代码是正确的，在巨大的整数值后使用L后缀，强制使用long类型
		 */
		
		long bigValue2=1233246758326457L;
		
		//以0开头的整数值是八进制的整数
		int octaValue=013;
		System.out.println(octaValue);//输出11
		
		//以0x或0X开头的整数值是十六进制的整数
		int hexValue1=0x13;
		System.out.println(hexValue1);
		int hexValue2=0XaF;
		System.out.println(hexValue2);
		
		//定义两个8位的二进制整数
		int binVal1 = 0b11010100;
		byte binVal2=0B01101001;
		//定义一个32位的二进制整数，最高位是符号位
		//用下划线将数字隔开时，得保证下划线两边都是数字
		int binVal3 = 0B1000_0000_0000_0000_0000_0000_0000_0011;
		
		System.out.println(binVal1);
		System.out.println(binVal2);
		System.out.println(binVal3);
		
		/*
		 * 定义一个8位的二进制数，该数值默认占32位，因此它是一个正数
		 * 只是强制类型转换成byte时产生了溢出，最终导致binVal4变成了-23
		 */
		byte binVal4 = (byte) 0b1110_1001;
		System.out.println(binVal4);
		
		/*
		 * 定义一个32位的二进制数，最高位是1
		 * 但由于数值后添加L后缀，因此该整数的实际占64位，第32位的1不是符号位了
		 * 因此binVal5的值等于2的31次方+2+1
		 */
		
		long binVal5 = 0B1000_0000_0000_0000_0000_0000_0000_0011L;
		System.out.println(binVal5);
		
	}



}
