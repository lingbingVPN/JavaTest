package java05;

public class StaticInitTest {
	//��ִ�о�̬��ʼ���齫a��̬��Ա������ֵΪ6
	static{
		a=6;
	}
	
	//�ٽ�a��̬��Ա������ֵΪ9
	static int a=9;
	public static void main(String[] args){
		System.out.println(StaticInitTest.a);
	}
}
