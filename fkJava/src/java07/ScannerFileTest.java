package java07;

import java.io.File;
import java.util.Scanner;

public class ScannerFileTest {
	public static void main(String[] args)throws Exception{
		//��һ��File������ΪScanner�Ĺ���������
		//Scanner��ȡ�ļ�����
		Scanner sc=new Scanner(new File("ScannerFileTest.java"));
		System.out.println("ScannerFileTest.java�ļ��������£�");
		//�ж��Ƿ�����һ��
		while(sc.hasNextLine()){
			//����ļ��е���һ��
			System.out.println(sc.nextLine());
		}
	}
}
