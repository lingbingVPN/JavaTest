package java04;

import javax.print.attribute.standard.PrinterLocation;

public class ReturnTest {
	public static void main(String[] args){
		//һ���򵥵�forѭ��
		for(int i=0;i<3;i++){
			System.out.println("i��ֵ��:"+i);
			if(i==1){
				return;
			}
			System.out.println("renturn���������");
		}
	}
}
