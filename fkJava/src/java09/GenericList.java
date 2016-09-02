package java09;

import java.util.List;
import java.util.ArrayList;

public class GenericList {
	public static void main(String[] args){
		//创建一个只想保存字符串的List集合
		List<String> strList = new ArrayList<String>();
		strList.add("疯狂Java讲义");
		strList.add("疯狂Android讲义");
		//因为为集合添加了类型，下面代码将引起编译错误
		//String泛型的集合里只能加入String类型对象、
		//不能加入Integer类型对象
//		strList.add(5);
		strList.forEach(str->System.out.println(str.length()));
		
	
	}
}
