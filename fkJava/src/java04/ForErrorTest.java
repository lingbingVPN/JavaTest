package java04;

public class ForErrorTest {
	public static void main(String[] args){
		//ѭ���ĳ�ʼ��������ѭ��������ѭ��������䶼������һ��
		for(int count=0;count<10;count++){
			System.out.println(count);
			//�ٴ��޸���ѭ������
			count *=0.1;
		}
		System.out.println("ѭ��������");
	}
}
