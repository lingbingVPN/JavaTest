package java08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import javax.print.attribute.standard.PrinterLocation;

public class CollectionTest {
	public static void main(String[] args){
		//ʵ����һ�����򼯺ϵ�List����
		Collection collection = new ArrayList();
		//���Ԫ��
		collection.add("�����");
		//��Ȼ�����ﲻ�ܷŻ������͵�ֵ������Java֧���Զ�װ�䣬���԰ѻ������͵�ֵװ��Ϊ���ǵİ�װ�ࡣ
		collection.add(6);
		//���������Ԫ�صĸ���
		System.out.println("���ϵ�Ԫ�ظ�����:"+collection.size());
		//ɾ��������ָ����Ԫ��
		collection.remove(6);
		//ɾ��֮���ٿ������ϵ�Ԫ�ظ���
		System.out.println("���ϵ�Ԫ�ظ�����:"+collection.size());
		//�жϼ������Ƿ����ָ�����ַ���
		System.out.println("�������Ƿ����������ա��ַ�����"+collection.contains("�����"));
		
		collection.add("������JavaEE��ҵӦ��ʵս");
		//��������е�Ԫ��
		System.out.println("�����е�Ԫ�أ�"+collection);
		
		//ʵ����һ�� ���򼯺ϵ�Set����
		Collection books =new HashSet();
		books.add("������JavaEE��ҵӦ��ʵս");
		books.add("���Java����");
		System.out.println("Collection�����Ƿ����books���ϣ�"+collection.containsAll(books));
		//��collection������ɾ��books��Ԫ��
		collection.removeAll(books);
		//��collection�����е�Ԫ�����
		System.out.println("collection���ϵ�Ԫ�أ�"+collection);
		//ɾ��collection���������е�Ԫ��
		collection.clear();
		System.out.println("collection���ϵ�Ԫ�أ�"+collection);
		//����books������ֻʣ��c������Ҳ������Ԫ��
		books.retainAll(collection);
		System.out.println("books���ϵ�Ԫ��"+books);
	}
}
