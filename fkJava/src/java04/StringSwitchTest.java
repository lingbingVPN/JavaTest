package java04;

import org.w3c.dom.traversal.DocumentTraversal;

public class StringSwitchTest {
	public static void main(String[] args){
		//��������season
		String season="����";
		//ִ��switch��֧���
		switch (season) {
		case "����":
			System.out.print("��ů����");
			break;
		case "����":
			System.out.print("��������");
			break;
		case "����":
			System.out.append("�����ˬ");
			break;
		case "����":
			System.out.println("��ѩ����");
			break;
		default:
			System.out.println("�����������");
			break;
		}
	}
}
