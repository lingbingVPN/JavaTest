package java06;

public class Primitive2String {
	public static void main(String[] args){
		String intStr="123";
		//把一个特定字符串转换为int变量
		int it1=Integer.parseInt(intStr);
		int it2=new Integer(intStr);
		System.out.println(it2);
		System.out.println(it2);
		
		String floatStr="4.56";
		//把一个特定字符串转换成float变量
		float ft1=Float.parseFloat(floatStr);
		float ft2=new Float(floatStr);
		System.out.println(ft2);
		//把一个float变量转换成String变量
		String ftString=String.valueOf(2.345f);
		System.out.println(ftString);
		//把一个double变量转换成String变量
		String dbString=String.valueOf(3.44);
		System.out.println(dbString);
		//把一个boolean变量转换成String变量
		String boolStr=String.valueOf(true);
		System.out.println(boolStr.toUpperCase());
	}
}
