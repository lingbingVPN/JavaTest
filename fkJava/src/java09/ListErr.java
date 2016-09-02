package java09;

import java.util.List;
import java.util.ArrayList;

/*
 * 编译时不检查类型所导致的异常
 */
public class ListErr {
	public static void main(String[] args){
		//创建一个只想保存字符串的List集合
		List strList =new ArrayList();
		strList.add("疯狂Java讲义");
		strList.add("疯狂Android讲义");
		//不小心把一个Integer对象丢进了集合
		strList.add(5);
		strList.forEach(str->System.out.println(((String)str).length()));
	}
}
