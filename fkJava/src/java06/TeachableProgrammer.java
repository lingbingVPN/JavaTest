package java06;

public class TeachableProgrammer extends Programmer{
	public TeachableProgrammer(){}
	public TeachableProgrammer(String name){
		super(name);
	}
	
	//��ѧ������Ȼ��TeachableProgrammer�ඨ��
	private void teach(){
		System.out.println(getName()+"��ʦ�ڽ�̨�Ͻ���...");
	}
	
	private class Closure implements Teachable{
		/*
		 * �Ǿ�̬�ڲ���ص��ⲿ��ʵ��work����
		 * �Ǿ�̬�ڲ������õ����ý�������ͻ���
		 * �ṩһ���ص��ⲿ���;��
		 */
		
		public void work(){
			teach();
		}
	}
	
	//����һ���Ǿ�̬�ڲ�������
	//�����ⲿ��ͨ���÷Ǿ�̬�ڲ����������ص��ⲿ��ķ���
	public Teachable getCallbackReference(){
		return new Closure();
	}
}
