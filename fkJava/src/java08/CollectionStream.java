package java08;

import java.util.Collection;
import java.util.HashSet;


public class CollectionStream {
	public static void main(String[] args){
		//����books����
		Collection books=new HashSet();
		books.add(new String("������JavaEE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���IOS����"));
		books.add(new String("���Ajax����"));
		books.add(new String("���Android����"));
		
		
		// ͳ����������������Ӵ���ͼ������
		System.out.println(books.stream()
					.filter(ele->((String)ele).contains("���"))
					.count()); // ���4
		// ͳ������������Java���Ӵ���ͼ������
		System.out.println(books.stream()
					.filter(ele->((String)ele).contains("Java") )
					.count()); // ���2
		// ͳ�������ַ������ȴ���10��ͼ������
		System.out.println(books.stream()
					.filter(ele->((String)ele).length() > 10)
					.count()); // ���2
		// �ȵ���Collection�����stream()����������ת��ΪStream,
		// �ٵ���Stream��mapToInt()������ȡԭ�е�Stream��Ӧ��IntStream
				books.stream().mapToInt(ele -> ((String)ele).length())
		// ����forEach()��������IntStream��ÿ��Ԫ��
					.forEach(System.out::println);// ���8  11  16  7  8
	}
}
