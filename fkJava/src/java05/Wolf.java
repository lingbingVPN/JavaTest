package java05;

class Creature{
	public Creature(){
		System.out.println("Creature�޲����Ĺ�����");
	}
}

class Animal extends Creature{
	public Animal(String name){
		System.out.println("Animal��һ�������Ĺ�������"
				+ "�ö�ΰ��nameΪ:"+name);
	}
	
	public Animal(String name,int age){
		//ʹ��this����ͬһ�����صĹ�����
		this(name);
		System.out.println("Animal�����������Ĺ�������"
				+ "��agΪ"+age);
	}
}
public class Wolf extends Animal{
	
	public Wolf(){
		//��ʽ���ø��������������Ĺ�����
		super("��̫��",3);
		System.out.println("Wolf�޲����Ĺ�����");
	}
	
	public static void main(String[] args){
		new Wolf();
	}
	

}
