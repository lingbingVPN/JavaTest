package java05;

public class ReturnThis {
	public int age;
	public ReturnThis grow(){
		age++;
		//return this���ص��ø÷����Ķ���
		return this;
	}
	
	public static void main(String[] args){
		ReturnThis rt=new ReturnThis();
		//������������ͬһ����
		rt.grow()
		.grow()
		.grow();
		System.out.println("rt��age��Ա����ֵ��:"+rt.age);
	}
}
