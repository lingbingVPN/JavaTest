package java09;

import java.util.List;
import java.util.ArrayList;

public class GenericList {
	public static void main(String[] args){
		//����һ��ֻ�뱣���ַ�����List����
		List<String> strList = new ArrayList<String>();
		strList.add("���Java����");
		strList.add("���Android����");
		//��ΪΪ������������ͣ�������뽫����������
		//String���͵ļ�����ֻ�ܼ���String���Ͷ���
		//���ܼ���Integer���Ͷ���
//		strList.add(5);
		strList.forEach(str->System.out.println(str.length()));
		
	
	}
}
