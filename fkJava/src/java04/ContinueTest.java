package java04;

import javax.print.attribute.standard.PrinterLocation;

public class ContinueTest {
	public static void main(String[] args){
		//һ���򵥵�forѭ��
		for(int i=0;i<3;i++){
			System.out.println("i��ֵ��"+i);
			if(i==1){
				//���Ա���ѭ��ʣ�µ����
				continue;
			}
			System.out.println("continue���������");
		}
	}
}
