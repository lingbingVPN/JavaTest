package java05;

import javax.imageio.event.IIOReadWarningListener;

public class PrimitiveTransferTest {
	
	public static void swap(int a, int b){
		//�������д���ʵ��a��b������ֵ����
		//����һ����ʱ����������a������ֵ
		int tmp=a;
		a=b;
		b=tmp;
		System.out.println("");
	}

	public static void main(String[] args) {
		int a=6;
		int b=9;
		swap(a, b);
		System.out.println(a);
		System.out.println(b);
	}

}
