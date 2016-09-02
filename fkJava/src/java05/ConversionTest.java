package java05;

import org.omg.PortableServer.ServantActivator;

public class ConversionTest {
	public static void main(String[] args){
		double d=13.4;
		long l=(long)d;
		System.out.println(l);
		
		int in=5;
		//试图把一个数值类型的变量转换为boolean类型，将出错
//		boolean b=(boolean)in;
		
		Object obj="Hello";
		//obj变量的编译类型为Object，Object与String存在
		//继承关系，所以可以强制类型转换
		String objStr=(String)obj;
		System.out.println(objStr);
		//定义一个objPei变量，编译类型为Object，实际类型为Integer
		Object objPri=new Integer(5);
		System.out.println(objPri);
		//objPri实际类型是Integer,与String没有继承关系
		//所以下面会引发异常
		String str=(String)objPri;
	}
}
