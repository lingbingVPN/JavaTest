package java06;

import java.lang.ref.WeakReference;

public class ReferenceTest {
	public static void main(String[] args)throws Exception{
		//����һ���ַ�������"
		String str=new String("���Java����");
		//����һ�������ã��ô����������õ�"���Java����"�ַ���
		WeakReference wr=new WeakReference(str);
		//�ж�str���ú�"���Java����"�ַ���֮�������
		str=null;
		//ȡ�������������õĶ���
		System.out.println(wr.get());
		//ǿ����������
		System.gc();
		System.runFinalization();
		//�ٴ�ȡ�������������õĶ���
		System.out.println(wr.get());
	}
}
