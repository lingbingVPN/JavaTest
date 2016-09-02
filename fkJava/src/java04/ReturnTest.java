package java04;

import javax.print.attribute.standard.PrinterLocation;

public class ReturnTest {
	public static void main(String[] args){
		//一个简单的for循环
		for(int i=0;i<3;i++){
			System.out.println("i的值是:"+i);
			if(i==1){
				return;
			}
			System.out.println("renturn后的输出语句");
		}
	}
}
