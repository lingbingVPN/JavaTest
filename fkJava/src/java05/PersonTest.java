package java05;

public class PersonTest {
	public static void manin(String[] args){
		//ʹ��Person�ඨ��һ��Person���͵ı���
		Person p;
		//ͨ��new�ؼ��ֵ���Person��Ĺ�����������һ��Personʵ��
		//�ٽ���ʵ�������������p����
		p = new Person();
		
		//���������ϳ�һ��
		Person p2 = new Person();
		
		//ͨ��ʵ����������ͨ��Ա��������Ϊ�丳ֵ
		p.name = "���";
		p.age = 45;
		//ͨ��ʵ����������ͨ����
		p.say("Java���Ժܺã�ѧ����������");
		
		//ֱ�����p��ʵ������
		System.out.println(p.name);
		System.out.println(p.age);
		
		//��p������ֵ����p2����
		p2=p;
		System.out.print(p2.name);
		System.out.println(p2.age);
	}
}
