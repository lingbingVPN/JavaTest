package java09;

import java.util.List;
import java.util.ArrayList;

/*
 * ����ʱ��������������µ��쳣
 */
public class ListErr {
	public static void main(String[] args){
		//����һ��ֻ�뱣���ַ�����List����
		List strList =new ArrayList();
		strList.add("���Java����");
		strList.add("���Android����");
		//��С�İ�һ��Integer���󶪽��˼���
		strList.add(5);
		strList.forEach(str->System.out.println(((String)str).length()));
	}
}
