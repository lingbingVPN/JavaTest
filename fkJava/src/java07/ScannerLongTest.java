package java07;

import java.util.Scanner;

public class ScannerLongTest {
	public static void mian(String[] args){
		//System.in�����׼���룬���Ǽ�������
		Scanner sc=new Scanner(System.in);
		//�ж��Ƿ�����һ��long������
		while(sc.hasNextLong()){
			//���������
			System.out.println("��������������ǣ�"
					+ sc.nextLong());
		}
	}
}
