package java05;

public class ThisInConstructor {
	//����һ����Ϊfoof�ĳ�Ա����
	public int foo=12;
	public ThisInConstructor(){
		//�ڹ������ж���һ��foo����
		int foo=0;
		//ʹ��this����ù��������ڳ�ʼ���Ķ���
		//����Ĵ��뽫��Ѹù��������ڳ�ʼ���Ķ����foo��Ա������Ϊ6
		this.foo=6;
	}
	
	public static void main(String[] args){
		//����ʹ��ThisInConstructor�����Ķ����foo��Ա����
		//��������Ϊ6������������뽫���6
		System.out.println(new ThisInConstructor().foo);
		
	}
}
