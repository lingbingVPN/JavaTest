package java07;



public class RuntimeTest {
	public static void mian(String[] args){
		//��ȡJava�������������ʱ����
		Runtime rt=Runtime.getRuntime();
		System.out.println("������������"+rt.availableProcessors());
		System.out.println("�����ڴ�����"+rt.freeMemory());
		System.out.println("���ڴ�����"+rt.totalMemory());
		System.out.println("��������ڴ�����"+rt.maxMemory());
}
}
