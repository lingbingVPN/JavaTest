package java06;

class Person3{
	private String name;
	public Person3(String name){
		this.name=name;
	}
}
public class PrintObject {
	public static void main(String[] args){
		//����һ��Person���󣬽�֮����p����
		Person3 p=new Person3("�����");
		//��ӡp�����õ�Person����
		System.out.println(p);
	}
}
