package java04;

import java.nio.channels.InterruptedByTimeoutException;

public class ArrayTest {
	public static void main(String[] args){
		//��̬��ʼ�����ɳ���Ա��ʽָ��ÿ������Ԫ�صĳ�ʼֵ����ϵͳ�������鳤�ȡ�
		//����һ��int�������͵ı�����������ΪintArr
		int[] intArr;
		//ʹ�þ�̬��ʼ������ʼ������ʱ��ָ������Ԫ�صĳ�ʼֵ����ָ�����鳤��
		intArr = new int[] {5,6,8,20};
		//��һ��һ��Object�������͵ı�����������ΪobjArr
		Object[] objArr;
		//ʹ�þ�̬��ʼ������ʼ������ʱ����Ԫ�ص�������
		//��������ʱ��ָ��������Ԫ�����͵�����
		objArr = new String[] {"Java","���"};
		Object[] objArr2;
		//ʹ�þ�̬��ʼ��
		objArr2 = new Object[] {"Java","���"};
		
		//����Ķ���ͳ�ʼ��ͬʱ��ɣ�ʹ�ü򻯵ľ�̬��ʼ��д��
		int[] a={5,6,8,9,35};
		
		
		
		//��̬��ʼ������ʼ��ʱ����Աָֻ�����鳤�ȣ���ϵͳΪ����Ԫ�ط����ʼֵ
		//���鶨��ͳ�ʼ��ͬʱ��ɣ�ʹ�ö�̬��ʼ���﷨
		int[] prices = new int[5];
		//����Ķ���ͳ�ʼ��ͬhi��ɣ���ʼ������ʱԪ�ص������Ƕ�������ʱԪ�����͵�����
		Object[] books = new String[4];
		
		
		//ʹ������
		//���objArr����ĵڶ���Ԫ��
		System.out.println(objArr[1]);
		
		//ΪobjArr2�ĵ�һ������Ԫ�ظ�ֵ
		objArr2[1] = "Spring";
		System.out.println(objArr2[1]);
		
		//��������Ԫ��ָ��������ֵ�������鳤�ȣ���������Ĵ��뽫������ʱ�����쳣
//		System.out.println(objArr2[2]);
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
	at java04.ArrayTest.main(ArrayTest.java:42)
		 */
		
		//ʹ��������prices�����ÿ������Ԫ�ص�ֵ
		for(int i=0;i<prices.length;i++){
			System.out.println(prices[i]);
		}
		
		//�Զ�̬��ʼ���������Ԫ�ؽ��и�ֵ
		books[0] = "���Java����";
		books[1] = "������Java EE��ҵӦ��ʵս";
		
		//ʹ��ѭ�����books�����ÿ������Ԫ�ص�ֵ
		for(int i=0;i<books.length;i++){
			System.out.println(books[i]);
		}
	}
}
