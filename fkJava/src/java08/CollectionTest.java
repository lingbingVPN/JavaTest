package java08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import javax.print.attribute.standard.PrinterLocation;

public class CollectionTest {
	public static void main(String[] args){
		//实例化一个有序集合的List对象
		Collection collection = new ArrayList();
		//添加元素
		collection.add("孙悟空");
		//虽然集合里不能放基本类型的值，但是Java支持自动装箱，可以把基本类型的值装箱为它们的包装类。
		collection.add(6);
		//输出集合中元素的个数
		System.out.println("集合的元素个数是:"+collection.size());
		//删除集合中指定的元素
		collection.remove(6);
		//删除之后再看看集合的元素个数
		System.out.println("集合的元素个数是:"+collection.size());
		//判断集合中是否包含指定的字符串
		System.out.println("集合里是否包含“孙悟空”字符串："+collection.contains("孙悟空"));
		
		collection.add("轻量级JavaEE企业应用实战");
		//输出集合中的元素
		System.out.println("集合中的元素："+collection);
		
		//实例化一个 无序集合的Set对象
		Collection books =new HashSet();
		books.add("轻量级JavaEE企业应用实战");
		books.add("疯狂Java讲义");
		System.out.println("Collection集合是否包含books集合？"+collection.containsAll(books));
		//在collection集合中删除books中元素
		collection.removeAll(books);
		//将collection集合中的元素输出
		System.out.println("collection集合的元素："+collection);
		//删除collection集合里所有的元素
		collection.clear();
		System.out.println("collection集合的元素："+collection);
		//控制books集合里只剩下c集合里也包含的元素
		books.retainAll(collection);
		System.out.println("books集合的元素"+books);
	}
}
