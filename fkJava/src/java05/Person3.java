package java05;

public class Person3 {
	//ʹ��privaete���γ�Ա����������Щ��Ա������������
	private String name;
	private int age;
	//�ṩ����������name��Ա����
	public void setName(String name){
		//ִ�к�����У�飬Ҫ���û���������2~6λ֮��
		if(name.length()>6||name.length()<2){
			System.out.println("�����õ�����������Ҫ��");
			return;
		}else {
			this.name=name;
		}
	}
	
	public String getName(){
		return this.name;
	}
	
	//�ṩ����������age��Ա����
	public void setAge(int age){
		//ִ�к�����У�飬Ҫ���û����������0~100֮��
		if(age>100||age<0){
			System.out.println("����������䲻�Ϸ�");
			return;
		}else {
			this.age=age;
		}
	}
	
	public int getAge(){
		return this.age;
	}
}
