package java05;

public class Ostrich extends Bird{
	//��дBird���fly����
	public void fly(){
		System.out.println("��ֻ���ڵ��ϱ���...");
	}
	
	public void callOverridedMethod(){
		//�����෽����ͨ��super����ʽ���ø��౻���ǵķ���
		super.fly();
	}
	
	public static void main(String[] args){
		//����Ostrich����
		Ostrich os=new Ostrich();
		//ִ��Ostrich�����fly����
		os.fly();
		//���Ե��ø��౻���ǵķ���
		os.callOverridedMethod();
	}

}
