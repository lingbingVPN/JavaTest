package java06;

public class DiscernVariable {
	private String prop="�ⲿ���ʵ������";
	private class InClass{
		private String prop="�ڲ����ʵ������";
		public void info(){
			String prop="�ֲ�����";
			//ͨ���ⲿ������.this.varName�����ⲿ��ʵ������
			System.out.println("�ⲿ���ʵ������ֵ��"
								+DiscernVariable.this.prop);
			//ͨ��this.varName�����ڲ���ʵ���ı���
			System.out.println("�ڲ����ʵ������ֵ��"
									+this.prop);
			//ֱ�ӷ��ʾֲ�����
			System.out.println("�ֲ�������ֵ��"+prop);
			}
	}
	
	public void test(){
		InClass in=new InClass();
		in.info();
	}
	
	public static void main(String[] args){
		new DiscernVariable().test();
	}
}

