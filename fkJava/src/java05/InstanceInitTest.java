package java05;

public class InstanceInitTest {
	//ִ�г�ʼ���齫aʵ��������ֵΪ6
	{
	 a=6;
	}
	//��ִ�н�aʵ��������ֵΪ9
	int  a=9;
	public static void main(String[] args){
		System.out.println(new InstanceInitTest().a);
	}
}
