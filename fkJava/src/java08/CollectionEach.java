package java08;

import java.sql.SQLNonTransientConnectionException;
import java.util.Collection;
import java.util.HashSet;

public class CollectionEach {
	public static void main(String[] args){
		//����һ������
		Collection books = new HashSet();
		books.add("������JavaEE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���Android����");
		
		//����forEach()������������
		books.forEach(obj->System.out.println("��������Ԫ��:"+obj));
	}
}
