package java09;

public class Apple {
	//ʹ��T�����βζ���ʵ������
	private T info;
	public Apple(){}
	//���淽����ʹ��T�����β������幹����
	public Apple(T info){
		this.info=info;
	}
	
	public void setInfo(T info){
		this.info=info;
	}
	
	public T getInfo(){
		return this.info;
	}
	
	public static void main(String[] args){
		//���ڴ���T�βε���String�����Թ�����ֻ����String
		Apple<String> a1=new Apple<>("ƻ��");
		System.out.println(A1.getInfo());
		//���ڴ���T�βε���Double,���Թ���������ֻ����Double��double
		Apple<Double> a2=new Apple<>(5.67);
		System.out.println(a2.getInfo);
	}
}
