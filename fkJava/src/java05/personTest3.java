package java05;

public class personTest3 {
	public static void main(String[] args){
		Person3 p=new Person3();
		//��Ϊage��Ա�����ѱ����أ�����ֱ�ӷ���
		//����������뽫���ֱ������
//		p.age=10;
		//����ͨ��setAge�������Է��ʵ�age��Ա����
		//���ǻ���ʾ������������䲻�Ϸ���
		p.setAge(1000);
		//����p��age��Ա����Ҳ����ͨ�����Ӧ��getAge����
		//��Ϊ��������ò��Ϸ����������������age��ֵ��Ϊԭʼֵ��0
		System.out.println(p.getAge());
		//�������÷���Ҫ�󣬿��Գɹ�
		p.setAge(30);
		//��age���
		System.out.println(p.getAge());
		//����ֱ�Ӳ���p��name��Ա������ֻ��ͨ����Ӧ��
		//getName��setName����
		p.setName("���");
		System.out.println(p.getName());
	}
}
