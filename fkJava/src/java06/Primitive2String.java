package java06;

public class Primitive2String {
	public static void main(String[] args){
		String intStr="123";
		//��һ���ض��ַ���ת��Ϊint����
		int it1=Integer.parseInt(intStr);
		int it2=new Integer(intStr);
		System.out.println(it2);
		System.out.println(it2);
		
		String floatStr="4.56";
		//��һ���ض��ַ���ת����float����
		float ft1=Float.parseFloat(floatStr);
		float ft2=new Float(floatStr);
		System.out.println(ft2);
		//��һ��float����ת����String����
		String ftString=String.valueOf(2.345f);
		System.out.println(ftString);
		//��һ��double����ת����String����
		String dbString=String.valueOf(3.44);
		System.out.println(dbString);
		//��һ��boolean����ת����String����
		String boolStr=String.valueOf(true);
		System.out.println(boolStr.toUpperCase());
	}
}
