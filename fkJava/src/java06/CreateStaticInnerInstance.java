package java06;

class StaticOut{
	//����һ����̬�ڲ��࣬��ʹ�÷��ʿ��Ʒ�
	//��ͬһ�����������ɷ��ʸ��ڲ���
	static class StaticIn{
		public StaticIn(){
			System.out.println("��̬�ڲ���Ĺ�����");
		}
	}
}

public class CreateStaticInnerInstance {
		public static void main(String[] args){
			StaticOut.StaticIn in=new StaticOut.StaticIn();
			/*
			*�������ɸ�Ϊ�������д��룺
			*ʹ��OutterClass.InnerClass����ʽ�����ڲ������
			*StaticOut.StaticIn in;
			*ͨ��new�������ڲ��๹����������̬�ڲ���ʵ��
			*in = new StaticOut.StaticIn();
			*/
		}
}
