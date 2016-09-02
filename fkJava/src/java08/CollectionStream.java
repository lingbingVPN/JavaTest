package java08;

import java.util.Collection;
import java.util.HashSet;


public class CollectionStream {
	public static void main(String[] args){
		//创建books集合
		Collection books=new HashSet();
		books.add(new String("轻量级JavaEE企业应用实战"));
		books.add(new String("疯狂Java讲义"));
		books.add(new String("疯狂IOS讲义"));
		books.add(new String("疯狂Ajax讲义"));
		books.add(new String("疯狂Android讲义"));
		
		
		// 统计书名包含“疯狂”子串的图书数量
		System.out.println(books.stream()
					.filter(ele->((String)ele).contains("疯狂"))
					.count()); // 输出4
		// 统计书名包含“Java”子串的图书数量
		System.out.println(books.stream()
					.filter(ele->((String)ele).contains("Java") )
					.count()); // 输出2
		// 统计书名字符串长度大于10的图书数量
		System.out.println(books.stream()
					.filter(ele->((String)ele).length() > 10)
					.count()); // 输出2
		// 先调用Collection对象的stream()方法将集合转换为Stream,
		// 再调用Stream的mapToInt()方法获取原有的Stream对应的IntStream
				books.stream().mapToInt(ele -> ((String)ele).length())
		// 调用forEach()方法遍历IntStream中每个元素
					.forEach(System.out::println);// 输出8  11  16  7  8
	}
}
