package java06;


class Out{
	//����һ���ڲ��࣬�����÷��ʿ��Ʒ�
	//��ֻ��ͬһ������������ɷ��ʸ��ڲ���
	class In{
		public In(String msg){
			System.out.println(msg);
		}
	}
}

public class CreateInnerInstance {
	public static void main(String[] args){
		Out.In in=new Out().new In("������Ϣ");
		/*
		 * �������ɸ�Ϊ�������д��룺
		 *ʹ��OutterClass.InnerClass����ʽ�����ڲ������
		 *Out.In in;
		 *�����ⲿ��ʵ�����Ǿ�̬�ڲ���ʵ�����Ĵ��ڸ�ʵ����
		 *Out out = new Out();
		 *ͨ���ⲿ��ʵ����new�������ڲ��๹���������Ǿ�̬�ڲ���ʵ��
		 *in = out.new In("������Ϣ");
		 */
	}
}
