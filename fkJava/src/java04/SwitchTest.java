package java04;

public class SwitchTest {
	public static void main(String[] arg){
		//��������score,��Ϊ�丳ֵ'c'
		char score='C';
		//ִ��switch��֧���
		switch (score){
		case 'A':
			System.out.print("����");
			break;
		case 'B':
			System.out.println("����");
			break;
		case 'C':
			System.out.println("��");
			System.out.println("switch���軨����");
			break;
		case 'D':
			System.out.print("����");
			break;
		case 'F':
			System.out.print("������");
			break;
		default:
			System.out.println("�ɼ��������");
			break;
		
		}
	}
}
