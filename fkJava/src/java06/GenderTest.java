package java06;

public class GenderTest {
	public static void main(String[] args){
		Gender2 g=Gender2.valueOf("FEMALE");
		g.setName("Ů");
		System.out.println(g + "����:" + g.getName());
		
		//��ʱ����nameֵʱ������ʾ��������
		g.setName("��");
		System.out.println(g + "����:" + g.getName());
	}
}
